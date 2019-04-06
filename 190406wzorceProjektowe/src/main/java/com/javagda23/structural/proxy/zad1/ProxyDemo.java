package com.javagda23.structural.proxy.zad1;

public class ProxyDemo {
    public static void main(String[] args) {
        ConfigLoader configLoader = new ExternalConfigLoaderProxy("http:ss.com");

        configLoader.load();
        configLoader.load();
        configLoader.load();
    }
}
