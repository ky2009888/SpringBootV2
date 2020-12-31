package com.ky2009666.apps.parammappingshow.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述:
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/31
 */
@Controller
@RequestMapping("/attr")
public class RequestAttributeController {
    /**
     * 演示跳转中参数携带的用法，通过注解@RequestAttribute来演示.
     *
     * @param request 请求对象.
     * @return String 跳转路径.
     */
    @GetMapping("/goto")
    public String goToA(HttpServletRequest request) {
        request.setAttribute("msg", "跳转成功");
        request.setAttribute("code", 200);
        return "forward:/attr/success";
    }

    /**
     * 展示结果集，通过注解@RequestAttribute来演示.
     *
     * @param msg  消息参数.
     * @param code 编码参数.
     * @return String
     */
    @ResponseBody
    @GetMapping("/success")
    public String success(@RequestAttribute("msg") String msg, @RequestAttribute("code") Integer code) {
        JSONObject result = new JSONObject();
        result.put("msg", msg);
        result.put("code", code);
        return result.toJSONString();
    }
}
