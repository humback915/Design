package com.pattern.design.observer;

public class NotifyMain  {
    public static void main(String[] args) {
        /** 관찰 대상 생성 */
        ITarget t = new Target();

        /** 대상 옵저버 생성 */
        IObserver ob1 = new Observer();
        IObserver ob2 = new Observer();

        /** 그룹에 옵저버 추가 */
        t.addObserver(ob1);
        t.addObserver(ob2);

        /** 그룹 내 옵저버들에게 알림 */
        t.notifiy();

        /** 그룹에 옵저버 삭제 */
        t.removeObserver(ob2);

        /** 그룹 내 속한 ob2를 제외한 옵저버들에게 알림 */
        t.notifiy();
    }
}
