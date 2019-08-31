package com.lukmie.cats.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer tailLength;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cat_id")
    private List<Toy> toys;

    public Cat() {
    }

    public Cat(String name, Integer tailLength, Gender gender) {
        this.name = name;
        this.tailLength = tailLength;
        this.gender = gender;
    }

    public Cat(String name, Integer tailLength, Gender gender, List<Toy> toys) {
        this.name = name;
        this.tailLength = tailLength;
        this.gender = gender;
        this.toys = toys;
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

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }
}
