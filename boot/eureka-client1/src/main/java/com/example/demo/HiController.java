package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/8/1
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class HiController {
    @Value( "${server.port}" )
    String  port;
    @GetMapping("/hi")
    public String home(@RequestParam String name){
        return "hi "+name+", l am from port: "+port;
    }
}
