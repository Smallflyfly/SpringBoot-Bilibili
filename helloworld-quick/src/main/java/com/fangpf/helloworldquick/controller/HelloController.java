package com.fangpf.helloworldquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-14 11:32
 */

/*
@ResponseBody   //这个类的所有方法返回的数据直接写给浏览器（如果是对象转为json数据）
@Controller
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello world quick";
    }
}
