package com.pattern.design.adapter.goods;

import com.pattern.design.adapter.inter.E110V;

public class HairDryer implements E110V {
    @Override
    public void power() {
        System.out.println("헤어 드라이어 110V");
    }
}
