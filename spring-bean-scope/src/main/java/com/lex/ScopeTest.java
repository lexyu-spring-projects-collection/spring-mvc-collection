package com.lex;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @date : 2023/7/1
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScopeTest {
    private static int count;

    public ScopeTest() {
        System.out.println("ScopeTest Class Constructor = " + incr());
    }

    private static int incr() {
        return ++count;
    }
}
