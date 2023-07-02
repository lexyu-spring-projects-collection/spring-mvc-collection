package com.lex;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @date : 2023/7/2
 */
@Component
@Scope("request")
public class ScopeTestReq {
    private static int count;

    public ScopeTestReq() {
        System.out.println("ScopeTestReq Class Constructor = " + incr());
    }

    private static int incr() {
        return ++count;
    }
}
