package com.ky2009.apps.springboot2yml.controller;

import com.ky2009.apps.springboot2yml.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/27
 */
@RestController
@RequestMapping("/person")
public class ShowPersonController {
    /**
     * 自动加载person对象
     */
    @Autowired
    private Person person;

    /**
     * 显示person对象的信息
     *
     * @return show
     */
    @GetMapping("/show")
    public String show() {
        return person.toString();
    }
}
