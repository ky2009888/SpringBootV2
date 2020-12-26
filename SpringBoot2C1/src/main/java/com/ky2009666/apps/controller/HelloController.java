package com.ky2009666.apps.controller;

import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ��������:
 * ��Ŀ����:SpringBootV2
 * ��������:2020/12/26
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     * ��ʾ�汾��
     * @return
     */
    @GetMapping("/show")
    public String show() {
        return SpringBootVersion.getVersion();
    }
}
