package com.lukmie.cats.model;

import java.util.List;

public class CreateOwnerRequest {
    private String name;
    private List<CreateCatRequest> cats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CreateCatRequest> getCats() {
        return cats;
    }

    public void setCats(List<CreateCatRequest> cats) {
        this.cats = cats;
    }
}
