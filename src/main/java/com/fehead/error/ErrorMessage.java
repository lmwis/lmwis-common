package com.fehead.error;

import java.util.Date;

/**
 * @author lmwis
 * @description:错误信息封装
 * @date 2019-08-28 20:29
 * @Version 1.0
 */
public class ErrorMessage {

    //系统错误码
    private Integer errorCode = EmBusinessError.UNKNOWN_ERROR.getErrorCode();

    //错误信息
    private String errorMsg = EmBusinessError.UNKNOWN_ERROR.getErrorMsg();

    //发送错误的请求url
    private String url;

    //时间戳
    private Date timestamp;

    public ErrorMessage(String url){
        this.url = url;
        this.timestamp = new Date();
    }

    public ErrorMessage(String url,Integer errorCode,String errorMsg){
        this(url);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
