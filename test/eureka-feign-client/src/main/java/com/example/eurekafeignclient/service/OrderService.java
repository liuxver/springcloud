package com.example.eurekafeignclient.service;

import com.example.eurekafeignclient.EurekaClientFeignOrder;
import com.example.eurekafeignclient.po.ShopCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class OrderService {
    @Autowired
    EurekaClientFeignOrder eurekaClientFeignOrder;

    public List<ShopCar> getOrdersById(Integer id){
        return eurekaClientFeignOrder.getOrdersById( id );
    }

    public ShopCar addOrders(Integer goodsid,Integer userid){
        System.out.println( "goodsid:"+goodsid+" user id :"+userid );
        return eurekaClientFeignOrder.addOrder( goodsid,userid );
    }

    public String deleteOrders(Integer id){
        return eurekaClientFeignOrder.deleteOrder( id );
    }

}
