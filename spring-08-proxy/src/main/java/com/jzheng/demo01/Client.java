package com.jzheng.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
//        host.rent();

        // 代理出了负责 host 的功能外一般还会有很多附属功能，签合同什么的
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
