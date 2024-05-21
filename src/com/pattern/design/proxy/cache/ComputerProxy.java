package com.pattern.design.proxy.cache;

import com.pattern.design.proxy.inter.DisplayIF;

public class ComputerProxy implements DisplayIF {

    private String text;
    private Browser browser;

    public ComputerProxy(String text){
        this.text = text;
    }
    @Override
    public Browser show() {
        if(browser == null){
            this.browser = new Browser(text);
            System.out.println("ComputerProxy display loading : "+text);
        }
        System.out.println("ComputerProxy display use cache : "+text);
        return browser;
    }
}
