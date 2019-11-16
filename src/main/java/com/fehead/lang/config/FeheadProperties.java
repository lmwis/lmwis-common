package com.fehead.lang.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 18:51
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "fehead")
public class FeheadProperties {

    private SmsProperties smsProperties = new SmsProperties();

    private EmailProperties emailProperties = new EmailProperties();

    private TimeProperties timeProperties = new TimeProperties();

}
