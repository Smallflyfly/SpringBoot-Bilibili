package com.fangpf.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-21 09:30
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, Map<String, Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("loginUser", username);
            return "dashboard";
        }else{
            map.put("msg", "用户名或者密码错误");
            return "login";
        }
    }
}
