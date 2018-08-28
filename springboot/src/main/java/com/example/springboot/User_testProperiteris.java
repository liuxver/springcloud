package com.example.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Configuration
@PropertySource( value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.example")
public class User_testProperiteris {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
