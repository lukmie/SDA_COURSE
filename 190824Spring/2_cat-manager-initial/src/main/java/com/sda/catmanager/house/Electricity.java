package com.sda.catmanager.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Electricity {
    @Autowired
    private Permission permission;

    public void runEle() {
        permission.hasPermission();
    }
}
