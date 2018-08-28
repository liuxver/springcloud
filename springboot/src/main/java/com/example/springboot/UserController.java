package com.example.springboot;

import com.example.springboot.dao.UserDao;
import com.example.springboot.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation( value = "用户列表",notes = "用户列表")
    @RequestMapping(value = {""},method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> users=userService.findAll();
        return users;
    }


    @ApiOperation( value = "创建用户",notes="创建用户")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public User postUser(@RequestBody User user){
        return userService.saveUser( user );
    }



    @ApiOperation( value = "获得用户详细信息",notes = "根据url的id来获取详细信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public User getUser(@PathVariable Long id){
        return userService.findUserById( id );
    }


    @ApiOperation( value = "更新信息",notes = "根据url的id来指定更新用户信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public User putUser(@PathVariable Long id,@RequestBody User user){
        User user1=new User();
        user1.setId( user.getId() );
        user1.setUsername( user.getUsername() );
        user1.setPassword( user.getPassword() );
        return userService.updateUser( user1 );

    }


    @ApiOperation( value = "删除用户",notes="根据url的id来指定删除用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser( id );
        return "success";
    }

    @Autowired
    private UserDao userDao;

    @ApiIgnore
    @RequestMapping("/getAll")
    public List<User> getAll(){
        return userDao.findAll();
    }
}
