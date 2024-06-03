package com.pattern.design.factory;

/**
 * 물건을 만드는 팩토리 추상 클래스
 */
public abstract class Factory {

    /** Instance 생성시 abstract create() 호출하여 생성 */
    /** 외부에서 객체 생성 시 해당 메소드로 호출, but 어떤 타입의 객체인지는 하위 클래스에서 정의 */
    public Product newInstance(){
        Product p = create();
        p.producting();
        return p;
    }

    /** 접근 제한을 위해 protected 사용 */
    protected abstract Product create();
}
