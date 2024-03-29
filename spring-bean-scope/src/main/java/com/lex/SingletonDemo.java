package com.lex;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @date : 2023/6/6
 */
@Component(value = "singletonDemo")
//@Scope("singleton") // default
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) // default
public class SingletonDemo {

}
