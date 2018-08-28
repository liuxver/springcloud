package top.dolo.serviceorder.service;


import top.dolo.serviceorder.entites.ShopCar;

import java.util.List;

public interface ShopCarService {

    public ShopCar save(ShopCar shopCar);

    public void delete(Integer id);

    public List<ShopCar> findAllByUserid(Integer id);


}
