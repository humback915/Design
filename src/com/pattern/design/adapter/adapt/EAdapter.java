package com.pattern.design.adapter.adapt;


import com.pattern.design.adapter.inter.E110V;
import com.pattern.design.adapter.inter.E220V;

/**
 * 110V로 변환해주는 어댑터이므로 110V의 인터페이스 상속
 */
public class EAdapter implements E110V {

    private E220V e220V;

    public EAdapter(E220V e220V){
        this.e220V = e220V;
    }

    @Override
    public void power() {
        e220V.connect();
    }
}
