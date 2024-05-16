package com.pattern.design.singleton.oncethread;

public class SingletonMain {
    public static void main(String[] args) {
        AClient aClient = new AClient();

        BClient bClient = new BClient();

        Singleton a = aClient.getSingletonClient();
        Singleton b = bClient.getSingletonClient();

        // 객체 비교
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(b);
    }
}
