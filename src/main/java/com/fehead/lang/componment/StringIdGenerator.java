package com.fehead.lang.componment;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @Description: 字符串id生成器
 * @Author lmwis
 * @Date 2019-11-14 21:41
 * @Version 1.0
 */
@Component
public class StringIdGenerator {


    /**
     * 使用UUID生成字符串ID
     * 规则：
     *  当前时间戳+UUID
     * 总位数45
     * 名称命名不规范 已过期 推荐使用 generateId
     * @return
     */
    @Deprecated
    public String generatorId() {

        return new Date().getTime()
                +
                Stream.of(UUID.randomUUID().toString().split("-"))
                        .reduce((a, b) -> a + b)
                        .get();

    }

    /**
     * 使用UUID生成字符串ID
     * 规则：
     *  当前时间戳+UUID
     * 总位数45
     * @return
     */
    public String generateId() {

        return new Date().getTime()
                +
                Stream.of(UUID.randomUUID().toString().split("-"))
                        .reduce((a, b) -> a + b)
                        .get();

    }

}
