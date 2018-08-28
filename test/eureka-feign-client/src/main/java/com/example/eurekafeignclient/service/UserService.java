package com.example.eurekafeignclient.service;

import com.example.eurekafeignclient.EurekaClientFeignUser;
import com.example.eurekafeignclient.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class UserService {
    @Autowired
    EurekaClientFeignUser eurekaClientFeignUser;

    public List<Person> getAllPerson(){
        return eurekaClientFeignUser.getAllPerson();
    }


    public Person findPersonById(Integer id){
        return eurekaClientFeignUser.getPersonById( id );
    }

    public Person findPersonByName(String name){
        return eurekaClientFeignUser.getPersonByName( name );
    }

    public String deletePerson(Integer id){
        return eurekaClientFeignUser.deletePerson( id );
    }

    public Person updatePerson(Integer id,Person person){
        return eurekaClientFeignUser.updatePerson( id,person );
    }

    public Person addPerson(Person person){
        return eurekaClientFeignUser.addPerson( person );
    }

}
