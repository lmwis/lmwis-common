package com.fehead.lang.componment;

import com.fehead.lang.properties.FeheadProperties;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description: 打印logo
 * @Author: lmwis
 * @Date 2020-12-19 18:15
 * @Version 1.0
 */
@Component
public class FeheadPropertiesBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof FeheadProperties){
            System.out.println();
            System.out.println("  ______     _                       _ \n" +
                    " |  ____|   | |                     | |\n" +
                    " | |__  ___ | |__    ___   __ _   __| |\n" +
                    " |  __|/ _ \\| '_ \\  / _ \\ / _` | / _` |\n" +
                    " | |  |  __/| | | ||  __/| (_| || (_| |\n" +
                    " |_|   \\___||_| |_| \\___| \\__,_| \\__,_|");
            System.out.print("\033[33;m"+" :: Fehead Common :: "+"\033[0m");
            System.out.print("   ");
            System.out.print("(v1.0.SNAPSHOT)");
            System.out.println();
            System.out.println();
        }
        return bean;
    }
}
