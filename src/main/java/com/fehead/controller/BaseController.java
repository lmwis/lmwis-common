package com.fehead.controller;

import com.fehead.error.BusinessException;
import com.fehead.error.EmBusinessError;
import com.fehead.response.CommonReturnType;
import com.fehead.response.MetronicMeta;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lmwis
 * @description:基本的controller类，异常处理和部分校验
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
            logger.info(responseData.toString());
        } else if(ex instanceof DataAccessException){ //数据库连接错误
            logger.info(ex.getMessage());
            responseData.put("errorCode", EmBusinessError.DATARESOURCE_CONNECT_FAILURE.getErrorCode());
            responseData.put("errorMsg", EmBusinessError.DATARESOURCE_CONNECT_FAILURE.getErrorMsg());
            logger.info(responseData.toString());
        }else{
            responseData.put("errorCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
            responseData.put("errorMsg", ex.getMessage());
            logger.info(responseData.toString());
        }

        return CommonReturnType.create(responseData,"fail");
    }

    /**
     * 判断字符串是否为空
     * @param args
     * @return
     * @throws BusinessException
     */
    protected boolean validateNull(String ... args) throws BusinessException {
        for (String s:args){
            if (StringUtils.isEmpty(s)){
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
            }
        }
        return true;
    }

    /**
     * 判断字符串是否为空字符串，数字是否为0，对象是否为null
     * @param args
     * @return
     * @throws BusinessException
     */
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

    /**
     * MetronicMeta 封装 ，产生表头
     *  默认按照id升序排列
     * @param pageable
     * @param totalPage
     * @param size
     * @return
     */
    protected MetronicMeta generatorMeta(Pageable pageable, Integer totalPage, Integer size){
        MetronicMeta meta = new MetronicMeta();
        meta.setPage(pageable.getPageNumber());
        meta.setPerpage(pageable.getPageSize());
        meta.setSort("asc");
        meta.setTotal(size);
        meta.setPages(totalPage);
        meta.setField("id");
        return meta;
    }
}
