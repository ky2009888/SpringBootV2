package com.ky2009666.apps;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Lenovo
 */
@SpringBootApplication
@Slf4j
public class Springboot2c1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot2c1Application.class, args);
        //打印spring boot中已经定义好的bean组件的名称
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        log.info("打印已经定义好的bean组件的名称:");
        for (String beanName : beanDefinitionNames) {
            log.info(beanName);
        }
    }

}
