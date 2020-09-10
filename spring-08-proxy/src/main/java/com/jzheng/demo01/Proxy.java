package com.jzheng.demo01;

public class Proxy {
    private Host host;

    public Proxy(){}

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }

    public void seeHost() {
        System.out.println("看房。。。");
    }

    public void fare() {
        System.out.println("收中介费。。。");
    }

    public void contract() {
        System.out.println("签合同。。。");
    }
}
