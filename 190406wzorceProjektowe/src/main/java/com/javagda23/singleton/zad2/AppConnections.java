package com.javagda23.singleton.zad2;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

    //    private static AppConnections appConnections = new AppConnections();//to jest typu eager
    private static AppConnections appConnections;

    public static AppConnections getInstance(){
        if (null == appConnections){
            appConnections = new AppConnections();
            System.out.println("SINGLETON CREATED");
        }
        return appConnections;
    }

    private List<String> connectedUsers = new ArrayList<>();
    private Long timeout;
    private int currentConnectionsNum = 0;

    private AppConnections() {
    }

    public void connectUser(final String userName){
        currentConnectionsNum += 1;
        connectedUsers.add(userName);
    }

    public List<String> getConnectedUsers() {
        return connectedUsers;
    }

    public Long getTimeout() {
        return timeout;
    }

    public int getCurrentConnectionsNum() {
        return currentConnectionsNum;
    }
}
