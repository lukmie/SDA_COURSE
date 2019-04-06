package com.javagda23.creational.builder.zad2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(builderMethodName = "personBuilder", buildMethodName = "create")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private int age;
}
