package com.tarsjava.test;

import com.qq.tars.quickstart.server.testapp.HelloServant;

public class HelloServantImpl implements HelloServant {
    @Override
    public String hello(int no, String name){
        return String.format("hello no=%s, name=liu%s, time=%s", no, name, System.currentTimeMillis());
    }
}
