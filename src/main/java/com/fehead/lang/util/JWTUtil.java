package com.fehead.lang.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * @Description: jwt工具 生成 or 解析token
 * @Author: lmwis
 * @Date 2020-12-19 19:42
 * @Version 1.0
 */
public class JWTUtil {

    /**
     * 生成token
     * @param subject 内容
     * @param containTime 持续时间
     * @param sign 签名
     * @return
     */
    public static String generatorToken(String subject,long containTime,String sign){
        if(StringUtils.isEmpty(subject)||StringUtils.isEmpty(sign)||containTime<0){
            throw new IllegalArgumentException("参数不合法");
        }
            return Jwts.builder()
                    .setSubject(subject)
//                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 24 * 1000))
                    .setExpiration(new Date( System.currentTimeMillis() + containTime))
                    .signWith(SignatureAlgorithm.HS512, sign)
                    .compact();
    }

    /**
     * 返回调用链
     * @param token token
     * @param sign sign
     * @return
     */
    public static Claims parasTokenBody(String token, String sign){
        if(StringUtils.isEmpty(token)||StringUtils.isEmpty(sign)){
            throw new IllegalArgumentException("参数不合法");
        }
        // parse the token.
        return Jwts.parser()
                .setSigningKey(sign)
                .parseClaimsJws(token.replace("Bearer ", ""))
                .getBody();
    }

    /**
     * 解析token获取subject
     * @param token
     * @param sign
     * @return
     */
    public static String parasToken4Subject(String token,String sign){
        try {
            return parasTokenBody(token,sign)
                    .getSubject();
        }catch (Exception exp){
            throw new IllegalArgumentException("token无效");
        }
    }

    /**
     * 解析过期时间
     * @param token token
     * @param sign sign
     * @return Date类型
     */
    public static Date parasToken4ExpiredTime(String token,String sign){
        return parasTokenBody(token,sign).getExpiration();
    }

    /**
     * 解析过期时间
     * @param token token
     * @param sign sign
     * @return long类型
     */
    public static long parasToken4ExpiredTimeLong(String token,String sign){
        return parasToken4ExpiredTime(token,sign).getTime();
    }

    /**
     * 判断token现在是否过期
     * @param token token
     * @return 过期返回true
     */
    public static boolean isExpired(String token,String sign){
        // 小于表示已经过期
        if(parasToken4ExpiredTimeLong(token,sign)<new Date().getTime()){
            return true;
        }
        return false;
    }

    /**
     * token还有多久过期
     * @param token token
     * @return 毫秒数
     */
    public static long isExpiredTime(String token,String sign){
        if(isExpired(token,sign)){
            // 已经过期返回0
            return 0;
        }
        return new Date().getTime()-parasToken4ExpiredTimeLong(token,sign);
    }

    /**
     * 将token时间延长指定时间
     * @param token
     * @param sign
     * @return
     */
//    public static String isExpiredTime(String token,String sign,long containTime){
//
//        return
//    }
}
