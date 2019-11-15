package com.fehead.lang.error;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-15 21:25
 * @Version 1.0
 */
public class AuthenticationException extends Exception implements CommonError {

    private CommonError commonError;

    // 直接接受EmBusinessError的传参用于构造业务异常
    public AuthenticationException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    // 接受自定义errMsg的方式构造业务异常
    public AuthenticationException(CommonError commonError, String errorMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errorMsg);
    }

    @Override
    public int getErrorCode() {
        return commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
