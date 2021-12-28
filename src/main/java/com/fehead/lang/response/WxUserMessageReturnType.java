package com.fehead.lang.response;

import io.swagger.annotations.ApiModel;

/**
 * @Description: 微信接受用户消息返回类型
 * @Author: lmwis
 * @Date 2020-11-28 16:38
 * @Version 1.0
 */
@ApiModel(value = "微信接受用户消息返回类型",parent = FeheadResponse.class)
public class WxUserMessageReturnType extends FeheadResponse {


    public static WxUserMessageReturnType create(Object result) {
        WxUserMessageReturnType type = new WxUserMessageReturnType();
//        type.setData(result);
        return type;
    }
}
