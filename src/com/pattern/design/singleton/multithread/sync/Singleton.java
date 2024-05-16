package com.pattern.design.singleton.multithread.sync;

public class Singleton {
    private static Singleton singleton= null;

    private Singleton(){

    }

    /**
     * synchronized 키워드 사용
     * @return
     */
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
