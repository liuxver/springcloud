package com.example.eurekaclient1.dao;


import com.example.eurekaclient1.po.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by liuxv on 2018/8/2
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

/*
UserDao扩展了JpaRepository的接口
 */
public interface GoodsDao extends JpaRepository<Goods,Long> {

}
