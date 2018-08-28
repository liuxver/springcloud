package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class MiyaController {
    @Value( "${my.name}" )
    private String name;
    @Value( "${my.age}" )
    private int age;


    @RequestMapping(value = "/miya")
    public String miya(){
        return name+":"+age;
    }
}
