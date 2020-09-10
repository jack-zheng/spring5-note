package com.jzheng.demo04;

import com.jzheng.demo01.Host;
import com.jzheng.demo01.Rent;
import com.jzheng.demo02.UserDaoImpl;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(host);

        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
