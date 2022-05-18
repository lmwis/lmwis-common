package com.fehead.lang.response;


import lombok.Data;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 21:16
 * @Version 1.0
 */
@Data
//@AllArgsConstructor
public class ErrorMsgType {
    private int errorCode;

    private String errorMsg;

    public ErrorMsgType(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
