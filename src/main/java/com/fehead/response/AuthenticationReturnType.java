package com.fehead.response;

/**
 * @author lmwis
 * @description:
 * @date 2019-08-29 15:56
 * @Version 1.0
 */
public class AuthenticationReturnType extends FeheadResponse{

    //返回状态码
    Integer code;


    public static AuthenticationReturnType create(Object result,Integer code){
        AuthenticationReturnType authenticationReturnType = new AuthenticationReturnType();
        authenticationReturnType.setCode(code);
        authenticationReturnType.setData(result);
        return authenticationReturnType;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
