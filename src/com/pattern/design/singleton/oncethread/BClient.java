package com.pattern.design.singleton.oncethread;

public class BClient {

    private Singleton singleton;

    public BClient(){
        this.singleton = Singleton.getInstance(); // 객체 생성
    }
    public Singleton getSingletonClient(){
        return this.singleton;
    }
}
