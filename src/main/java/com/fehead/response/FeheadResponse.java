package com.fehead.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author lmwis
 * @description:Fehead返回类型，root
 * @date 2019-08-28 20:32
 * @Version 1.0
 */
@ApiModel("api接口通用返回类型")
public class FeheadResponse {

    // 返回数据
    @ApiModelProperty("数据")
    protected Object data;
}
