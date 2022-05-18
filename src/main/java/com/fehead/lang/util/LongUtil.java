package com.fehead.lang.util;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/5/17 3:43 下午
 * @Version: 1.0
 */
public class LongUtil {

    public static boolean nullOrZero(Long arg){
        if (arg == null || arg == 0){
            return true;
        }
        return false;
    }
}
