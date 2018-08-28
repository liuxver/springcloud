package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.po.Goods;
import com.example.eurekafeignclient.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * created by liuxv on 2018/8/1
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @ApiOperation( value = "商品列表",notes = "显示商品列表，当前所有商品")
    @GetMapping("/goods")
    public List<Goods> getAllGoods(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.getAllGoods();
    }




    @ApiOperation( value = "添加商品",notes = "添加商品并保存到数据库")
    @RequestMapping(value = "/goods",method = RequestMethod.POST)
    public Goods postGoods(@RequestBody Goods goods,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.saveGoods( goods );
    }

    @ApiOperation( value = "获得商品详细信息",notes = "根据url的id来获取商品的详细信息")
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.GET)
    public Goods getGoods(@PathVariable Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.getGoodsById( id );
    }


    @ApiOperation( value = "更新商品",notes = "根据url指定的id来更新商品信息")
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.POST)
    public Goods putGoods(@PathVariable Long id,@RequestBody Goods goods, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.updateGoods( id,goods );
    }


    @ApiOperation( value = "删除商品",notes = "根据url指定的id来删除商品")
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.DELETE)
    public String deleteGoods(@PathVariable Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.deleteGoods( id );

    }

    @ApiOperation( value = "/getgoodspro/{id}",notes = "根据id查询商品的价格 ，但是 会因为是不是对内对外接口而价格不同")
    @RequestMapping(value = "/getgoodspro/{id}",method = RequestMethod.GET)
    public String getGoodsPro(@PathVariable Long id){
        return goodsService.getGoodsPro( id ).getPrice();
    }
}
