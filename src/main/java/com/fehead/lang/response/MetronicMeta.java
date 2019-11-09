package com.fehead.lang.response;

import io.swagger.annotations.ApiModel;

/**
 * @author lmwis
 * @description:metronic后台管理模版数据表格返回类型封装
 * @date 2019-08-30 09:01
 * @Version 1.0
 */
@ApiModel(value = "Metronic后台管理系统数据表格返回类型的表头")
public class MetronicMeta {

    private int page;

    private int pages;

    private int perpage;

    private int total;

    private String sort;

    private String field;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerpage() {
        return perpage;
    }

    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
