package com.fangpf.springboot.component;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-15 16:50
 */

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @description:
 * 在连接上
 */

//@Configuration
public class MyLocaleResolver implements LocaleResolver {

//    @Override
//    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//        String l = httpServletRequest.getParameter("l");
//        System.out.println(l);
//        Locale locale = Locale.getDefault();
//        if (!StringUtils.isEmpty(l)){
//            String[] split = l.split("_");
//            locale = new Locale(split[0], split[1]);
//            System.out.println(locale);
//        }
//        return locale;
//    }

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        System.out.println(l);
        Locale locale = Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
            String[] split = l.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
    }
}
