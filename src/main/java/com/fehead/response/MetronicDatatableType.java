package com.fehead.response;

import io.swagger.annotations.ApiModel;

/**
 * @author lmwis
 * @description:metronic后台管理模版数据表格返回类型
 * @date 2019-08-30 09:00
 * @Version 1.0
 */
@ApiModel(value = "Metronic后台管理系统数据表格返回类型",parent = FeheadResponse.class)
public class MetronicDatatableType extends FeheadResponse{

    MetronicMeta meta;


    public static MetronicDatatableType create(Object data, MetronicMeta meta) {
        MetronicDatatableType type = new MetronicDatatableType();
        type.setData(data);
        type.setMeta(meta);

        return type;
    }

    public MetronicMeta getMeta() {
        return meta;
    }

    public void setMeta(MetronicMeta meta) {
        this.meta = meta;
    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
