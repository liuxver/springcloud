package com.example.eurekaclient.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/8/4
 * email:liuxver444@gmail.com
 * qq:1369058574
 */


/*
登录localhost:8762/swagger-ui.html查看接口信息
 */

@RestController
@RequestMapping("/getport")
public class PortController {
    @Value( "${server.port}" )
    String port;

    @ApiOperation( value = "获取端口号",notes = "获取服务端口号，用于测试负载均衡")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getPort(){
        return "This service is from port: "+port;
    }
}
