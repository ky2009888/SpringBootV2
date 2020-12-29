package com.ky2009666.apps.parammappingshow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:路径参数的用法
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/29
 * @author Lenovo
 */
@RestController
@RequestMapping("/param")
public class ParamShowController {
    /**
     * 根据id查询用户信息
     *
     * @return userMap
     */
    @GetMapping("/user/{id}/{name}")
    public Map<String, String> showParam(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        Map<String, String> userMap = new HashMap();
        userMap.put("id", String.valueOf(id));
        userMap.put("name", name);
        userMap.put("age", "19");
        return userMap;
    }
}
