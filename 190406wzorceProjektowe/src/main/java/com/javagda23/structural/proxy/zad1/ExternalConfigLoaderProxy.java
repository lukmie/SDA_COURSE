package com.javagda23.structural.proxy.zad1;

public class ExternalConfigLoaderProxy implements ConfigLoader{

    private String configuration;
    private String serverUrl;

    public ExternalConfigLoaderProxy(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public String load() {
        if (configuration == null){
            try {
                configuration = new ExternalConfigLoader(serverUrl).load();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return configuration;
    }
}
