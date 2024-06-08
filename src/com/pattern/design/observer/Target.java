package com.pattern.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Target implements ITarget{

    List<IObserver> observerList = new ArrayList<>();

    @Override
    public void notifiy() {
        for(IObserver o : observerList){
            o.update();
        }
    }

    @Override
    public void addObserver(IObserver o) {
        observerList.add(o);
        System.out.println("그룹 대상 추가 : "+o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observerList.remove(o);
        System.out.println("그룹 대상 삭제 : "+o);
    }
}
