package com.example.springboot.service;

import com.example.springboot.User;
import com.example.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findUserByName(String username){
        return userDao.findByUsername( username );
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public User saveUser(User user){
        return userDao.save( user );
    }

    public User findUserById(long id){
        return userDao.findById( id ).get();
    }

    public User updateUser(User user){
        return userDao.saveAndFlush( user );
    }

    public void deleteUser(long id){
        userDao.deleteById( id );
    }


}

