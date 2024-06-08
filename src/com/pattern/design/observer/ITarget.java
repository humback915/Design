package com.pattern.design.observer;

/**
 * 옵저버가 관찰할 대상 인터페이스
 */
public interface ITarget {
    void notifiy();
    void addObserver(IObserver o); // 옵저버 추가
    void removeObserver(IObserver o); // 옵저버 제거
}
