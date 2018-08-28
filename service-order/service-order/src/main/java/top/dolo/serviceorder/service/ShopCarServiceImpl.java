package top.dolo.serviceorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dolo.serviceorder.dao.ShopCarDAO;
import top.dolo.serviceorder.entites.ShopCar;
import javax.transaction.Transactional;
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
