package com.fehead.lang.properties;

import com.fehead.lang.model.SmsModel;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-16 18:52
 * @Version 1.0
 */
@Data
public class SmsProperties {

    private String loginPreKeyInRedis;
    private String registerPreKeyInRedis;
    private String resetPreKeyInRedis;
    private String appKey;
    private String secret;
    private String regionId;
    private String signName;
    private List<SmsModel> smsModel;
    private Integer smsNumber;
}
