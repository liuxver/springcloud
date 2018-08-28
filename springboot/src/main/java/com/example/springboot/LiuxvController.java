package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
/*
@RestController
@EnableConfigurationProperties({ConfigBean.class, User_testProperiteris.class})
public class LiuxvController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/liuxv")
    public String liuxv(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();

    }

    @Autowired
    User_testProperiteris userTestProperiteris;

    @RequestMapping(value = "/user")
    public String user(){
        return userTestProperiteris.getName()+":"+ userTestProperiteris.getAge();
    }





}
*/
