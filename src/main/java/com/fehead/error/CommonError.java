package com.fehead.error;

/**
 * @author lmwis
 * @description:
 * @date 2019-08-28 20:29
 * @Version 1.0
 */
public interface CommonError {
    public int getErrorCode();

    public String getErrorMsg();

    public CommonError setErrMsg(String errMsg);
}
