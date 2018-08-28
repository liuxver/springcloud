package com.example.eurekaribbonclient.service;

import com.example.eurekaribbonclient.po.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * created by liuxv on 2018/8/4
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

/*
登录localhost:8764/swagger-ui.html查看接口信息
 */

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String getport(){
        return restTemplate.getForObject( "http://eureka-client/getport",String.class );
    }

    public Goods[] getAllGoods(){
        return restTemplate.getForObject( "http://eureka-client/goods",Goods[].class );
    }

    public Goods saveGoods(Goods goods){
        return restTemplate.postForObject( "http://eureka-client/goods",goods,Goods.class );
    }

    public Goods getGoodsById(Long id){
        return restTemplate.getForObject( "http://eureka-client/goods/{id}",Goods.class,id );
    }


    public Goods updateGoods(Long id,Goods goods){
        return restTemplate.postForObject( "http://eureka-client/goods/{id}",goods,Goods.class,id);
    }

    public String deleteGoods(Long id){
        return restTemplate.getForObject( "http://eureka-client/goods/{id}",String.class,id );
    }

}
