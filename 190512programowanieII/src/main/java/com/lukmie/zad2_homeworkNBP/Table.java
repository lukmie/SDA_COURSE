package com.lukmie.zad2_homeworkNBP;

public enum Table {
    A("a"),
    C("c");

    private String table;

    Table(String table) {
        this.table = table;
    }

    public String getTableName() {
        return table;
    }
}
