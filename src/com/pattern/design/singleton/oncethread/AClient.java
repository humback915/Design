package com.pattern.design.singleton.oncethread;

public class AClient {

    private Singleton singleton;

    public AClient(){
        this.singleton = Singleton.getInstance(); // 객체 생성
    }

    public Singleton getSingletonClient() {
        return this.singleton;
    }
}
