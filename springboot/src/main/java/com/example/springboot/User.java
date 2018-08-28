package com.example.springboot;

import javax.persistence.*;

/**
 * created by liuxv on 2018/7/31
 * email:liuxver444@gmail.com
 * qq:1369058574
 */


/*
通过＠Entity 注解表明该类是一个实体类，它和数据库的表名相对应：
＠Id 注解表明该变 量对应于数据库中的 Id,
@Generated Value 注解配置 Id 字段为自增长；
＠Column 表明该变量 对应于数据库表中的字段， unique = true 表明该变量对应于数据库表中的字段为唯一约束。

 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false,unique = true)
    private String username;

    @Column
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
