package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by liuxv on 2018/8/1
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

/*
实现一个简单的 Feign Cliento 新建一个 EurekaClientFeign 的接口，
在接口上加＠FeignClient 注解来声明一个 Feign Client,
其中 value 为远程调用其他服务的服务名 ，
 FeignConfig.class 为 Feign Client 的配置类。
 在 EurekaClientFeign 接口内部有一个 sayHiFromClientEureka（）方法，
 该方法通过 Feign 来调用 eureka-client 服务的“旷的 API 接口，代码如下：
 */

@FeignClient(value = "eureka-client",configuration =FeignConfig.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
