package com.sda.catmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private Integer age;

    public Cat() {
    }

    public Cat(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
