package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user" )
public class UserController {
    @Autowired
    PersonRepository personRepository;

    //查询全部人员
     @GetMapping(value = "/allPerson")
     private List<Person> personList() {
     return personRepository.findAll();
     }

    //查询一个人员
    @GetMapping(value = "/person/{id}")
    public Optional<Person> personFindOne(@PathVariable("id") Integer id) {
    return personRepository.findById(id);
    }


    //删除一个人员
    @RequestMapping(value = "/person/{id}",method=RequestMethod.DELETE)
    public String personDelete(@PathVariable("id") Integer id) {
    personRepository.deleteById(id);
    return "successful";
    }



    //更新一个人员
    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    //
    @RequestMapping(value = "/person/adduser",method=RequestMethod.POST)
    public Person personAdd(@RequestParam("name") String name,
                            @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }


}