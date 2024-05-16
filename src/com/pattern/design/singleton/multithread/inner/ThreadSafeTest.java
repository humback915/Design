package com.pattern.design.singleton.multithread.inner;

import com.pattern.design.singleton.oncethread.Singleton;

public class ThreadSafeTest {
    public static void main(String[] args) {
        Thread threadA = new Thread(()-> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });
        Thread threadB = new Thread(()-> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });

        threadA.start();
        threadB.start();
    }
}
