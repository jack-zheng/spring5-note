package com.jzheng.demo02;

public class UserDaoProxyImpl {
    private UserDaoImpl impl;

    public void setImpl(UserDaoImpl impl) {
        this.impl = impl;
    }

    public void add() {
        printLog("add");
        System.out.println("Add user..");
    }

    public void query() {
        printLog("query");
        System.out.println("Query user...");
    }

    private void printLog(String msg) {
        System.out.println("Invoke " + msg + "...");
    }
}
