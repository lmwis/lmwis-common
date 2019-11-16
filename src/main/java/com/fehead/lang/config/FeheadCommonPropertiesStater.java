package com.fehead.lang.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 18:54
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(FeheadProperties.class)
public class FeheadCommonPropertiesStater {
}
