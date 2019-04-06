package com.javagda23.structural.proxy.zad2.security;

import java.util.Arrays;
import java.util.List;

public enum Role {
    USER(AccessType.READ),
    ADMIN(AccessType.WRITE, AccessType.READ);

    private List<AccessType> accessType;

    Role(AccessType... accessType) {
        this.accessType = Arrays.asList(accessType);
    }

    public List<AccessType> getAccessType() {
        return accessType;
    }
}
