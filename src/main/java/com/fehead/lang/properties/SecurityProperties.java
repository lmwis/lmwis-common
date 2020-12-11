package com.fehead.lang.properties;

import lombok.Data;

/**
 * @Description: 安全相关配置
 * @Author: lmwis
 * @Date 2020-12-11 16:37
 * @Version 1.0
 */
@Data
public class SecurityProperties {

    /**
     * 生成jwt的密钥，请根据项目进行覆盖
     */
    private String jwtSecretKey = "fehead";

    /**
     * token过期时间默认十天
     */
    private long jwtExpiredTime = 10 * 60 * 60 * 24 * 1000;
}
