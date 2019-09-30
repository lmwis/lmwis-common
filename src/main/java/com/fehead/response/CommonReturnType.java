package com.fehead.response;

/**
 * @author lmwis
 * @description:统一返回类型
 * @date 2019-08-28 20:33
 * @Version 1.0
 */
public class CommonReturnType extends FeheadResponse {
    // 返回请求处理结果
    private String status;


    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);

        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
