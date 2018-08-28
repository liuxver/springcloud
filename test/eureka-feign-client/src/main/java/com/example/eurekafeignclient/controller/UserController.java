package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.po.Goods;
import com.example.eurekafeignclient.po.Person;
import com.example.eurekafeignclient.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation( value = "用户列表",notes = "显示当前所有的用户")
    @GetMapping("/person")
    public List<Person> getAllPerson(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.getAllPerson();
    }

    @ApiOperation( value = "通过id查找用户",notes = "通过id查找用户")
    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable Integer id,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.findPersonById( id );
    }


    @ApiOperation( value = "通过姓名查找",notes = "通过姓名查找用户")
    @GetMapping("/person/name/{name}")
    public Person getPersonByName(@PathVariable String name,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.findPersonByName( name );
    }


    @ApiOperation( value = "删除用户",notes = "通过id删除用户")
    @DeleteMapping("/person/{id}")
    public String deletePersonById(@PathVariable Integer id,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.deletePerson( id );
    }

    @ApiOperation( value = "更新用户",notes = "通过id更新当前用户")
    @PostMapping("/person/{id}")
    public Person updatePerson(@PathVariable Integer id,@RequestBody Person person,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println( person.getAge() );
        return userService.updatePerson( id,person );
    }

    @ApiOperation( value = "添加用户",notes = "添加一个用户")
    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","*");
        return userService.addPerson( person );
    }

}
