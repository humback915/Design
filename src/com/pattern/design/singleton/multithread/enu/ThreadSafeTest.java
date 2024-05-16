package com.pattern.design.singleton.multithread.enu;

import com.pattern.design.singleton.multithread.enu.Singleton;

public class ThreadSafeTest {
    public static void main(String[] args) {
        Thread threadA = new Thread(()-> {
            Singleton singleton = Singleton.SINGLETON_INS;
            System.out.println(singleton);
        });
        Thread threadB = new Thread(()-> {
            Singleton singleton = Singleton.SINGLETON_INS;
            System.out.println(singleton);
        });

        threadA.start();
        threadB.start();
    }
}
