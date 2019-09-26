package com.fehead.response;

/**
 * @author lmwis
 * @description:
 * @date 2019-08-30 09:00
 * @Version 1.0
 */
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
