package com.ky2009666.apps.parammappingshow.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述:路径参数的用法
 * 项目名称:SpringBootV2
 * 创建日期:2020/12/29
 *
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
    public Map<String, String> showParam(@PathVariable("id") Integer id, @PathVariable("name") String name, @CookieValue("name") String name1) {
        Map<String, String> userMap = new HashMap();
        userMap.put("id", String.valueOf(id));
        userMap.put("name", name);
        userMap.put("age", "19");
        userMap.put("name1", name1);
        return userMap;
    }

    /**
     * 展示各种参数的获取的用法
     *
     * @param id 用户ID.
     * @param name 用户姓名.
     * @param pv pv
     * @param userAgent 用户代理.
     * @param header 头部.
     * @param age 年龄.
     * @param inters 兴趣.
     * @param params map参数.
     * @param _ga cookie参数
     * @param cookie 获取整个cookie.
     * @return map 参数的map.
     */
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> header,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String, String> params,
                                      @CookieValue("_ga") String _ga,
                                      @CookieValue("_ga") Cookie cookie) {
        Map<String, Object> map = new HashMap<>();

//        map.put("id",id);
//        map.put("name",name);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("headers",header);
        map.put("age", age);
        map.put("inters", inters);
        map.put("params", params);
        map.put("_ga", _ga);
        System.out.println(cookie.getName() + "===>" + cookie.getValue());
        return map;
    }
}
