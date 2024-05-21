package com.pattern.design.proxy.cache;

import com.pattern.design.proxy.inter.DisplayIF;

public class Computer implements DisplayIF {

    private String text;

    public Computer(String text){
        this.text = text;
    }
    @Override
    public Browser show() {
        System.out.println("Computer display loading : "+text);
        return new Browser(text);
    }
}
