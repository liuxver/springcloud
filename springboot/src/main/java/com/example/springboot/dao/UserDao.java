package com.example.springboot.dao;

import com.example.springboot.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
