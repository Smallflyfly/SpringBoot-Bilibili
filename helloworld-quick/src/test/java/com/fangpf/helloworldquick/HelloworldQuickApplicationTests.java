package com.fangpf.helloworldquick;

import com.fangpf.helloworldquick.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * Spingboot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldQuickApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean flag = ioc.containsBean("helloService");
        System.out.println(flag);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
