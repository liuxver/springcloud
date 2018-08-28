package top.dolo.serviceorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.dolo.serviceorder.entites.ShopCar;
import top.dolo.serviceorder.service.ShopCarServiceImpl;
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
    @PutMapping("/car/{id}")
    public ShopCar add(@PathVariable("id") Integer goodsid, @RequestParam("id") Integer userid){
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
