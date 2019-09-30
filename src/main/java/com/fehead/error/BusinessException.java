package com.fehead.error;

/**
 * @author lmwis
 * @description:业务异常类
 * @date 2019-08-28 20:28
 * @Version 1.0
 */
public class BusinessException extends Exception implements CommonError{
    private CommonError commonError;

    // 直接接受EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError) {
//        super(commonError.getErrorMsg());
        super();
        this.commonError = commonError;
    }

    // 接受自定义errMsg的方式构造业务异常
    public BusinessException(CommonError commonError, String errorMsg) {
//        super(errorMsg);
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errorMsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
