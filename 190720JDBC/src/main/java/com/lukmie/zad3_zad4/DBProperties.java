package com.lukmie.zad3_zad4;

public class DBProperties {

    private String url = "jdbc:mysql://localhost:3306/ksiegarnia?serverTimezone=UTC";
    private String user = "sdatest";
    private String password = "Start123!";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
