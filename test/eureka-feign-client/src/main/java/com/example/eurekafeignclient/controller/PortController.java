package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.po.Goods;
import com.example.eurekafeignclient.service.GoodsService;
import com.example.eurekafeignclient.service.PortService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class PortController {
    @Autowired
    GoodsService goodsService;

    @Autowired
    PortService portService;



    @GetMapping("/getport")
    public String getPort(){
        return goodsService.getPort();
    }



    @GetMapping("/getportconfig")
    public String getPortConfig(){
        return portService.getPortConfig();
    }

}
