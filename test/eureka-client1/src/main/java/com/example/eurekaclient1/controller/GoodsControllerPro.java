package com.example.eurekaclient1.controller;


import com.example.eurekaclient1.po.Goods;
import com.example.eurekaclient1.service.GoodsService;
import com.example.eurekaclient1.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuxv on 2018/8/8
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class GoodsControllerPro {
    @Autowired
    private ProfileService profileService;

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getgoodspro/{id}")
    public Goods getGoodsPro(@PathVariable Long id){
        Goods goods1=goodsService.findGoodsById( id );
        double count=Double.parseDouble( profileService.getCount() );
        System.out.println( count );
        double price1=Double.parseDouble( goods1.getPrice() );

        price1=price1*count;
        System.out.println( price1 );
        goods1.setPrice( String.valueOf(price1) );
        System.out.println( goods1.getPrice() );

        return goods1;
    }
}
