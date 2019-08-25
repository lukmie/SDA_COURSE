package com.sda.catmanager.house;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Water {

    //1.chcemy wstrzyknac klase permission

    //1.
    //co mamy wstrzyknac
    //tworzymy pola
    private Permission permission;

    //2.
    //generujemy konstruktor
//    @Autowired
    public Water(Permission permission) {
        this.permission = permission;
    }

    public void runWater() {
        permission.hasPermission();
    }

}
