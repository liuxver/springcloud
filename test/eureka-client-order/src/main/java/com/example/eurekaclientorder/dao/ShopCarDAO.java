package com.example.eurekaclientorder.dao;

import com.example.eurekaclientorder.entites.ShopCar;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ShopCarDAO extends JpaRepository<ShopCar, Integer> {

    public List<ShopCar> findAllByUserid(Integer id);

}
