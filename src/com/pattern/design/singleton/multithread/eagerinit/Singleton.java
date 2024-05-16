package com.pattern.design.singleton.multithread.eagerinit;

public class Singleton {
    /**
     * 이른 초기화
     */
    private static final Singleton SINGLETON_OBJ= new Singleton();

    private Singleton(){

    }

    /**
     * synchronized 사용
     * @return
     */
    public static synchronized Singleton getInstance(){
       return SINGLETON_OBJ;
    }
}
