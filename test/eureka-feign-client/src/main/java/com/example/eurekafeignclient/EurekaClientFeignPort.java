package com.example.eurekafeignclient;

import com.example.eurekafeignclient.config.FeignConfig;
import com.example.eurekafeignclient.po.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@FeignClient(value = "config-client",configuration =FeignConfig.class)

public interface EurekaClientFeignPort {
    @GetMapping(value = "/getport")
    public String getPortConfig();
}
