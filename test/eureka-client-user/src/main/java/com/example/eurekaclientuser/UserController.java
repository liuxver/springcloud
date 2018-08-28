package com.example.eurekaclientuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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

    //按照人名查询
    @GetMapping(value = "/person/name/{name}")
    public Person personListByAge(@PathVariable("name") String name) {
        return personRepository.findByName(name);
    }

    //删除一个人员
    @RequestMapping(value = "/person/{id}",method=RequestMethod.DELETE)
    public String personDelete(@PathVariable("id") Integer id) {
    personRepository.deleteById(id);
    return "successful";
    }



    //更新一个人员
    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id, @RequestBody Person person){
        Person person1 = new Person();
        person1.setId(id);
        person1.setName(person.getName());
        person1.setAge(person.getAge());
        person1.setPw( person.getPw() );
        return personRepository.save(person1);
    }

    //
    @RequestMapping(value = "/person/adduser",method=RequestMethod.POST)
    public Person personAdd(@RequestBody Person person) {
        return personRepository.save(person);
    }



}