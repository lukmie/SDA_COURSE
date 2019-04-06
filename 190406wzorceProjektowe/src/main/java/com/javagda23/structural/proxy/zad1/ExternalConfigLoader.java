package com.javagda23.structural.proxy.zad1;

class ExternalConfigLoader implements ConfigLoader {

    private String configuration;

    public ExternalConfigLoader(String serverURL) throws InterruptedException {
        Thread.sleep(2000L);
        System.out.println("Configuration from " + serverURL + " received.");
        this.configuration = "Configuration from " + serverURL;
    }

    @Override
    public String load() {
        return configuration;
    }
}
