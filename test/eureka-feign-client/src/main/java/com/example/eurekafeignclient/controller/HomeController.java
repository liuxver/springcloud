package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.po.Person;
import com.example.eurekafeignclient.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by liuxv on 2018/8/7
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class HomeController {
    @Autowired
    UserService userService;

    @ApiOperation( value = "登录",notes = "登录的逻辑")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public int login(@RequestBody Person person){
        List<Person> personList=userService.getAllPerson();
        Person p=null;
        for(int i=0;i<personList.size();i++){
            if(personList.get( i ).getName().equals( person.getName() )&&personList.get( i ).getPw().equals( person.getPw() )){
                p=personList.get( i );
                break;
            }
        }
        if(p!=null){
            return p.getId();
        }
        else{
            return -1;
        }
    }

}
