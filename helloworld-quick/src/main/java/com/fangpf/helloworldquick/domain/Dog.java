package com.fangpf.helloworldquick.domain;

import java.io.Serializable;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-14 14:25
 */
public class Dog implements Serializable {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
