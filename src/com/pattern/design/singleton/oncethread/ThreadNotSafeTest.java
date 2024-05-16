package com.pattern.design.singleton.oncethread;

import com.pattern.design.singleton.oncethread.Singleton;

public class ThreadNotSafeTest {
    public static void main(String[] args) {
        Thread threadA = new Thread(()-> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });
        Thread threadB = new Thread(()-> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });
        // 서로 다른 객체 주소 참조
        threadA.start();
        threadB.start();
    }
}
