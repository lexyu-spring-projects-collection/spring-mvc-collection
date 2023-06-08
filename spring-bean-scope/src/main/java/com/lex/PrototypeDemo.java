package com.lex;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @date : 2023/6/8
 */
@Component("prototypeDemo")
//@Scope("prototype")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeDemo {
}
