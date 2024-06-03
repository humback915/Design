package com.pattern.design.factory;

public class FactoryMain {
    public static void main(String[] args) {
        /** 물건 A만드는 팩토리 */
        Factory f = new FactoryA();
        Product p = f.newInstance(); /** newInstance()에서 create A */
        // CreateProduct 클래스에 대한 의존성 없이 상위클래스로 인스턴스 사용 가능
    }
}
