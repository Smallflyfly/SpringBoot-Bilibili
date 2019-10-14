package com.fangpf.helloworldquick.config;

import com.fangpf.helloworldquick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-14 15:27
 */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中：容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置service组件");
        return new HelloService();
    }
}
