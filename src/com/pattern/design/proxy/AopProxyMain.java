package com.pattern.design.proxy;

import com.pattern.design.proxy.aop.AopComputer;
import com.pattern.design.proxy.inter.DisplayIF;

import java.util.concurrent.atomic.AtomicLong;

public class AopProxyMain {
    public static void main(String[] args) {
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        DisplayIF i = new AopComputer("user",
                () ->{
                    System.out.println("before : ");
                    start.set(System.currentTimeMillis());
                },
                () ->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        /** 객체 loading */
        i.show();
        System.out.println("loading time : "+end.get());
        /** 객체를 cache로 불러옴 */
        i.show();
        System.out.println("loading time : "+end.get());
    }
}
