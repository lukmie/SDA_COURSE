package com.sda.catmanager.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gas {
    @Autowired
    private Permission permission;

    public void runGas() {
        permission.hasPermission();
    }
}

