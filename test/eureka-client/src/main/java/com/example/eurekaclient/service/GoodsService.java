package com.example.eurekaclient.service;

import com.example.eurekaclient.dao.GoodsDao;
import com.example.eurekaclient.po.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/8/2
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    public List<Goods> findAll(){
        return goodsDao.findAll();
    }

    public Goods saveGoods(Goods goods){
        return goodsDao.save( goods );
    }

    public Goods findGoodsById(long id){
        return goodsDao.findById( id ).get();
    }

    public Goods updateGoods(Goods goods){
        return goodsDao.saveAndFlush( goods );
    }

    public void deleteGoods(long id){
        goodsDao.deleteById( id );
    }


}
