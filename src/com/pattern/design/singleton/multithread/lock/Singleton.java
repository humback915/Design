package com.pattern.design.singleton.multithread.lock;

public class Singleton {

    /**
     * volatile 사용
     */
    private static volatile Singleton singleton;

    private Singleton(){

    }

    /**
     * Double sychronized 사용
     * @return
     */
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
