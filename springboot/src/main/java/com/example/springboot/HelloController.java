package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,liuxv!";
    }
}
