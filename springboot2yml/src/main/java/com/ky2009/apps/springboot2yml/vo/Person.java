package com.ky2009.apps.springboot2yml.vo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 功能描述:展示Yaml语言的使用方法
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/27
 *
 * @author Lenovo
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    /**
     * 姓名.
     */
    private String name;
    /**
     * 年龄.
     */
    private int age;
    /**
     * 兴趣.
     */
    private String[] intrest;
    /**
     * 生日.
     */
    private Date birthday;
    /**
     * 分数.
     */
    private Map<String,Integer> score;
    /**
     * 是否是老板.
     */
    private boolean boss;
    /**
     * 薪资.
     */
    private Set<Double> salary;
    /**
     * 喜欢的宠物.
     */
    private Map<String, List<Pet>> allPets;
}
