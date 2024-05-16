package com.pattern.design.singleton.multithread.inner;

public class Singleton {
    private Singleton(){

    }

    private static class SingletonLoader{
        private static final Singleton SINGLETON_OBJ =new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonLoader.SINGLETON_OBJ;
    }
}
