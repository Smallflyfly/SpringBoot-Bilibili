package com.fangpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-14 10:33
 */


/**
 * @description:
 * 来标注主程序类，说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
