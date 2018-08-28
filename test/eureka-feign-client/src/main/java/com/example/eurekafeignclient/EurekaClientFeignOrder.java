package com.example.eurekafeignclient;

import com.example.eurekafeignclient.config.FeignConfig;
import com.example.eurekafeignclient.po.ShopCar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@FeignClient(value = "eureka-client-order",configuration =FeignConfig.class)

public interface EurekaClientFeignOrder {

    @GetMapping("/cars/{id}")
    public List<ShopCar> getOrdersById(@PathVariable("id") Integer id);

    @PostMapping("/car/{id}")
    public ShopCar addOrder(@PathVariable("id") Integer goodsid, @RequestParam("userid") Integer userid);

    @DeleteMapping("/car/{id}")
    public String deleteOrder(@PathVariable("id") Integer id);

}
