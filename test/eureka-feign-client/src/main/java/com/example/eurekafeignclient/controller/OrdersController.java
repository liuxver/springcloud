package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.po.ShopCar;
import com.example.eurekafeignclient.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class OrdersController {
    @Autowired
    OrderService orderService;


    @ApiOperation( value = "获取购物车列表",notes = "根据用户id获取购物车列表")
    @GetMapping("/orders/{id}")
    public List<ShopCar> getAllOrderByUserid(@PathVariable("id") Integer id,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return orderService.getOrdersById( id );
    }

    @ApiOperation( value = "增加商品到购物车",notes = "根据用户id和商品id添加购物车商品条目")
    @PostMapping("/order/{id}")
    public ShopCar saveOrder(@PathVariable("id") Integer goodsid, @RequestParam("id") Integer userid,HttpServletResponse response){
        System.out.println( goodsid+"  :  "+userid );
        response.setHeader("Access-Control-Allow-Origin", "*");
        return orderService.addOrders( goodsid,userid );
    }

    @ApiOperation( value = "删除购物车商品",notes = "根据购物车条目id删除商品")
    @DeleteMapping("/order/{id}")
    public String deleteOrder(@PathVariable("id") Integer id,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return orderService.deleteOrders( id );
    }

}
