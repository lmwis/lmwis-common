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

    // 手机号+验证码登录
    private String loginPreKeyInRedis;
    private String registerPreKeyInRedis;
    private String resetPreKeyInRedis;
    private String appKey;
    private String secret;
    private String regionId;
    /**
     * 签名
     */
    private String signName;
    /**
     * 短信模板
     */
    private List<SmsModel> smsModel;
    /**
     * 验证码长度
     */
    private Integer smsNumber;
}
