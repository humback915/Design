package com.pattern.design.adapter.goods;

import com.pattern.design.adapter.inter.E220V;

public class Cleaner implements E220V {
    @Override
    public void connect() {
        System.out.println("청소기 220V");
    }
}
