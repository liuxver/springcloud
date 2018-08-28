package com.example.eurekafeignclient.po;



/**
 * Created by Peng
 * Time: 2016/12/16 17:56
 */

public class Person {

    private  Integer id;
    private String name;
    private Integer age;
    private String pw; 

    //必须要有构造函数
    public Person() {
    }

    
    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
