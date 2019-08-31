package com.lukmie.cats.model;

import javax.persistence.*;

@Entity(name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer tailLength;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Cat() {
    }

    public Cat(String name, Integer tailLength, Gender gender) {
        this.name = name;
        this.tailLength = tailLength;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTailLength() {
        return tailLength;
    }

    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
