package com.example.eurekafeignclient;

import com.example.eurekafeignclient.config.FeignConfig;
import com.example.eurekafeignclient.po.Person;
import com.example.eurekafeignclient.service.PortService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@FeignClient(value = "eureka-client-user",configuration =FeignConfig.class)

public interface EurekaClientFeignUser {
    @GetMapping("/user/allPerson")
    public List<Person> getAllPerson();

    @GetMapping("/user/person/{id}")
    public Person getPersonById(@PathVariable(value = "id") Integer id);

    @RequestMapping(value = "/user/person/{id}",method = RequestMethod.DELETE)
    public String deletePerson(@PathVariable(value = "id") Integer id);

    @RequestMapping(value = "/user/person/{id}",method = RequestMethod.PUT)
    public Person updatePerson(@PathVariable(value = "id") Integer id, @RequestBody Person person);

    @RequestMapping(value ="/user/person/adduser",method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person);

    @RequestMapping(value = "/user/person/name/{name}",method = RequestMethod.GET)
    public Person getPersonByName(@PathVariable(value = "name") String name);
}
