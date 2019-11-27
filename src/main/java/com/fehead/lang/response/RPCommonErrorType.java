package com.fehead.lang.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 21:11
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class RPCommonErrorType  extends FeheadResponse{

    private ErrorMsgType data;

    private String status;

}
