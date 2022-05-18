package com.fehead.lang.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/4/30 5:48 下午
 * @Version: 1.0
 */
public class GsonUtil {

    public static final Gson gson = new GsonBuilder().create();

    public static String toString(Object obj){
        return gson.toJson(obj);
    }

    public static <T> T readObject(String objStr , Class<T> cla){
       return gson.fromJson(objStr,cla);
    }
}
