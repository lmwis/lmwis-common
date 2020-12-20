package com.fehead.lang.response;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 21:16
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class ErrorMsgType {
    private int errorCode;

    private String errorMsg;

    @Override
    public String toString() {
        return "\"errorCode\":"+errorCode
                +",\"errorMsg\":"+"\""+errorMsg+"\"";
    }
}
