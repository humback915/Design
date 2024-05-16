package com.pattern.design.singleton.oncethread;

public class Singleton {

    // 1. 자기 자신을 객체로 가지고 있어야함.
    private static Singleton singleton= null;

    // 2. 기본 생성자를 private로 생성
    private Singleton(){

    }
    // 3. static메소드로 인스턴스 객체 제공
    // 하여 최초의 한 번만 생성하도록
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
