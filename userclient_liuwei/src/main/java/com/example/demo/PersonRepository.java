package com.example.demo;

import com.example.demo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Peng
 * Time: 2016/12/16 18:07
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
