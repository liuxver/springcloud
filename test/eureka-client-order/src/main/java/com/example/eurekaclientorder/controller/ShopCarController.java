package com.example.eurekaclientorder.controller;

import com.example.eurekaclientorder.entites.ShopCar;
import com.example.eurekaclientorder.service.ShopCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopCarController {

    @Autowired
    ShopCarServiceImpl shopCarService;

    //获取购物车列表
    @GetMapping("/cars/{id}")
    public  List<ShopCar> findAll(@PathVariable("id") Integer id){
        List<ShopCar> cars = shopCarService.findAllByUserid(id);
        return cars;
    }

    //购物车添加书
    @PostMapping("/car/{id}")
    public ShopCar add(@PathVariable("id") Integer goodsid, @RequestParam("userid") Integer userid){
        System.out.println( goodsid +": "+userid+" 1111111111111111111111111");
        ShopCar shopCar = new ShopCar();
        shopCar.setUserid(userid);
        shopCar.setGoodsid(goodsid);
        return shopCarService.save(shopCar);
    }

    //删除一本书本信息
    @DeleteMapping("/car/{id}")
    public String deleteOne(@PathVariable("id") Integer id){
        shopCarService.delete(id);
        return "success";
    }

}
