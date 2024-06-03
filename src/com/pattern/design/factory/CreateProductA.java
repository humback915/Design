package com.pattern.design.factory;

/**
 * 물건 A의 클래스
 */
public class CreateProductA implements Product{
    @Override
    public void producting() {
        System.out.println("ProductA create");
    }
}
