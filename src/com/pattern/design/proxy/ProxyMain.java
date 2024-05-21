package com.pattern.design.proxy;

import com.pattern.design.proxy.cache.ComputerProxy;
import com.pattern.design.proxy.inter.DisplayIF;

public class ProxyMain {
    public static void main(String[] args) {
        DisplayIF i = new ComputerProxy("admin");
        i.show();
        i.show();
    }
}
