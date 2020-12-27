package com.ky2009.apps.springboot2yml.vo;

import lombok.Data;
import lombok.ToString;

/**
 * 功能描述:宠物对象.
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/27
 * @author Lenovo
 */
@Data
@ToString
public class Pet {
    /**
     * 宠物名称.
     */
    private String name;
    /**
     * 宠物年龄.
     */
    private int age;
}
