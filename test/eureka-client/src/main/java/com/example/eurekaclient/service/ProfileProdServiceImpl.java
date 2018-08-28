package com.example.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created by liuxv on 2018/8/8
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Profile( value = "prod")
@Service
public class ProfileProdServiceImpl implements ProfileService{
    public ProfileProdServiceImpl(){
        System.out.println( "我是一个对外的实例!" );
    }

    @Value( "${count}" )
    String count;
    @Override
    public String getCount() {
        System.out.println( count );
        return count;
    }
}
