package com.example.eurekaribbonclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * created by liuxv on 2018/8/4
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
/*
由于 eureka-client 为两个实例，它们的端口为 8762 和 8763。
在调用 eureka-client 的 API 接口“／hi”时希望做到轮流访问这两个实例，
这时就需要将 RestTemplate 和 Ribbon 相 结合，进行负载均衡。
通过查阅官方文档，可以知道如何将它们结合在一起，
只需要在程序的 IoC 容器中注入一个 restTemplate 的 Bean，
 并在这个 Bean 上加上@LoadBalanced 注解，此时 RestTemplate 就结合了
 Ribbon 开启了负载均衡功能，代码如下：

 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate RestTemplate(){
        return new RestTemplate(  );
    }
}
