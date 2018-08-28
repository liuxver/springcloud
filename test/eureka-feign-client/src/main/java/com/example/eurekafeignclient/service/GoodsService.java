package com.example.eurekafeignclient.service;

import com.example.eurekafeignclient.EurekaClientFeign;
import com.example.eurekafeignclient.po.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/8/1
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class GoodsService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public List<Goods> getAllGoods(){
        return eurekaClientFeign.getAllGoods();
    }

    public String getPort(){
        return eurekaClientFeign.getPort();
    }

    public Goods getGoodsById(Long id){
        return eurekaClientFeign.getGoodsById( id );
    }

    public Goods saveGoods(Goods goods){
        return eurekaClientFeign.saveGoods( goods );
    }

    public Goods updateGoods(Long id,Goods goods){
        return eurekaClientFeign.updateGoods( id,goods );
    }

    public String deleteGoods(Long id){
        return eurekaClientFeign.deleteGoods( id );
    }

    public Goods getGoodsPro(Long id){
        return eurekaClientFeign.getGoodsPro( id );
    }

}
