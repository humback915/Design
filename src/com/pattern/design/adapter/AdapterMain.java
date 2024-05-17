package com.pattern.design.adapter;

import com.pattern.design.adapter.adapt.EAdapter;
import com.pattern.design.adapter.goods.Cleaner;
import com.pattern.design.adapter.goods.HairDryer;
import com.pattern.design.adapter.inter.E110V;

public class AdapterMain {

    public static void main(String[] args) {
        /** 110V */
        HairDryer h1 = new HairDryer();
        connect(h1);

        /** 220V -> 110V 로 변환하기 위한 어댑터 사용 */
        Cleaner c1 = new Cleaner();
        E110V adapter1 = new EAdapter(c1);
        connect(adapter1);

    }

    /**
     * 110V로 연결되는 메소드
     * @param e110V
     */
    public static void connect(E110V e110V){
        e110V.power();
    }
}
