package com.pattern.design.factory;

/**
 * A의 타입을 만드는 팩토리 하위 클래스
 */
public class FactoryA extends Factory{

    @Override
    protected Product create() {
        return new CreateProductA(); /** 클래스마다 만드는 물건타입이 달라짐 */
    }
}
