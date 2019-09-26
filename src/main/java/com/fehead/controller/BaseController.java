package com.fehead.controller;

import com.fehead.error.BusinessException;
import com.fehead.error.EmBusinessError;
import com.fehead.response.CommonReturnType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lmwis
 * @description:
 * @date 2019-08-28 20:27
 * @Version 1.0
 */
public class BaseController {
    Logger logger = LoggerFactory.getLogger(BaseController.class);

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

    // 定义exceptionHandler来解决controller层中未被吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex) {
        Map<String, Object> responseData = new HashMap<>();
        if (ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException)ex;
            responseData.put("errorCode", businessException.getErrorCode());
            responseData.put("errorMsg", businessException.getErrorMsg());
            System.out.println(responseData);
        } else if(ex instanceof DataAccessException){ //数据库连接错误
            logger.info(ex.getMessage());
            responseData.put("errorCode", EmBusinessError.DATARESOURCE_CONNECT_FAILURE.getErrorCode());
            responseData.put("errorMsg", EmBusinessError.DATARESOURCE_CONNECT_FAILURE.getErrorMsg());
            System.out.println(responseData);
        }else{
            responseData.put("errorCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
            responseData.put("errorMsg", ex.getMessage());
            System.out.println(responseData);
        }

        return CommonReturnType.create(responseData,"fail");
    }

    protected boolean validateNull(String ... args) throws BusinessException {
        for (String s:args){
            if (StringUtils.isEmpty(s)){
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
            }
        }
        return true;
    }

    protected boolean validateNull(Object ... args) throws BusinessException {
        for (Object o:args){
            if ((o instanceof String && StringUtils.equals(o.toString(),""))
                    || (o instanceof Integer && new Integer(o.toString())==0)
                    ||o==null){
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
            }
        }
        return true;
    }
}
