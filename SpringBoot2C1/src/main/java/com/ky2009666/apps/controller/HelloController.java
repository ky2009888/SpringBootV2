package com.ky2009666.apps.controller;

import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/26
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     * 显示版本号
     * @return
     */
    @GetMapping("/show")
    public String show() {
        return SpringBootVersion.getVersion();
    }
}
