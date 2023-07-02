package com.lex.practice.api;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author : Lex Yu
 * @date : 2023/7/2
 */
@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
//@SessionScope
//@ApplicationScope
public class MyBean {
    private String websiteName = "This is a Website Name";
    private static int count;

    public MyBean() {
        System.out.println("MyBean Object Created = " + incr());
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public int incr(){
        return ++count;
    }
}
