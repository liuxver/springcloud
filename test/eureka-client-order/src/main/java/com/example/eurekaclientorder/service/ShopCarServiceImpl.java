package com.example.eurekaclientorder.service;

import com.example.eurekaclientorder.dao.ShopCarDAO;
import com.example.eurekaclientorder.entites.ShopCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Autowired
    ShopCarDAO shopCarDAO;


    public ShopCar save(ShopCar shopCar) {
        return shopCarDAO.save(shopCar);
    }


    public void delete(Integer id) {
        shopCarDAO.deleteById(id);
    }



    public List<ShopCar> findAllByUserid(Integer id) {
        return shopCarDAO.findAllByUserid(id);
    }



}
