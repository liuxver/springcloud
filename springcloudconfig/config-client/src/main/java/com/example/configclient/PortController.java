package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
@RefreshScope

public class PortController {
    @Value( "${port}" )
    String port;
    @RequestMapping(value = "/getport")
    public String getPort(){
        return "l get a port :"+port;
    }
}
