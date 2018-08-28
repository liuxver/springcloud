package com.example.eurekaribbonclient.controller;

import com.example.eurekaribbonclient.po.Goods;
import com.example.eurekaribbonclient.service.RibbonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by liuxv on 2018/8/4
 * email:liuxver444@gmail.com
 * qq:1369058574
 */


/*
登录localhost:8764/swagger-ui.html查看接口信息
 */

@RestController
@RequestMapping("/goods")
public class goodsController {
    @Autowired
    RibbonService ribbonService;





    @ApiOperation( value = "商品列表",notes = "显示商品列表，当前所有商品")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Goods> getAllGoods(){
        Goods[] goods1=ribbonService.getAllGoods();

        List<Goods> goodsList= Arrays.asList(goods1);
        return goodsList;
    }

    @ApiOperation( value = "添加商品",notes = "添加商品并保存到数据库")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public Goods postGoods(@RequestBody Goods goods){
        return ribbonService.saveGoods( goods );
    }

    @ApiOperation( value = "获得商品详细信息",notes = "根据url的id来获取商品的详细信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Goods getGoods(@PathVariable Long id){
        return ribbonService.getGoodsById( id );
    }


    @ApiOperation( value = "更新商品",notes = "根据url指定的id来更新商品信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Goods putGoods(@PathVariable Long id,@RequestBody Goods goods){
        Goods goods1=new Goods();
        goods1.setId( id );
        goods1.setName( goods.getName() );
        goods1.setPrice( goods.getPrice() );
        return ribbonService.updateGoods( id,goods1 );
    }


    @ApiOperation( value = "删除商品",notes = "根据url指定的id来删除商品")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteGoods(@PathVariable Long id){
        return ribbonService.deleteGoods( id );

    }


}
