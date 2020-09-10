package com.jzheng.demo02;

public class Client {
    public static void main(String[] args) {
        UserDaoImpl impl = new UserDaoImpl();
        UserDaoProxyImpl proxy = new UserDaoProxyImpl();
        proxy.setImpl(impl);

        proxy.add();
        proxy.query();
    }
}
