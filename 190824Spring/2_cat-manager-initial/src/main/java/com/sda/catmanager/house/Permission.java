package com.sda.catmanager.house;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Permission {

    public void hasPermission() {
        System.out.println("perm is val");
    }
}
