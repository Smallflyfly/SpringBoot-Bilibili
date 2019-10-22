package com.fangpf.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-15 09:50
 */

@Controller
public class HelloController {

//    @ResponseBody
//    @RequestMapping("/")
//    public String hello(){
//        return "hello world";
//    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("user", "<h1>fang</h1>");
        map.put("account", Arrays.asList("zhangsan","lisi", "wangwu"));
        return "success";
    }
}
