package com.fehead.lang.response;

import lombok.Data;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 21:11
 * @Version 1.0
 */
@Data
public class RPCommonErrorType {

    private ErrorMsgType data;

    private String status;

}
