package com.pattern.design.proxy.aop;

import com.pattern.design.proxy.cache.Browser;
import com.pattern.design.proxy.inter.DisplayIF;

public class AopComputer implements DisplayIF {
    private String text;
    private Browser browser;

    /** */
    private Runnable before;
    private Runnable after;
    public AopComputer(String text, Runnable before, Runnable after){
        this.text = text;
        this.before =before;
        this.after = after;
    }
    @Override
    public Browser show() {
        before.run();
        if(browser == null){
            this.browser = new Browser(text);
            System.out.println("AopComputer browser display loading : "+text);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        after.run();
        System.out.println("AopComputer browser cache display loading : "+text);
        return null;
    }
}
