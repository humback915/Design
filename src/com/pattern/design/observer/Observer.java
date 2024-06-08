package com.pattern.design.observer;

public class Observer implements IObserver{
    @Override
    public void update() {
        System.out.println("업데이트 사항이 존재하여 이벤트 알림 발생");
    }
}
