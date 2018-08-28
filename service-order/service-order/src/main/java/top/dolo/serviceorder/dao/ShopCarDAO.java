package top.dolo.serviceorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.dolo.serviceorder.entites.ShopCar;
import java.util.List;

public interface ShopCarDAO extends JpaRepository<ShopCar, Integer> {

    public List<ShopCar> findAllByUserid(Integer id);

}
