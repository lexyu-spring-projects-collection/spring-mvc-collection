package com.lex;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @date : 2023/6/8
 */
@Getter
@Setter
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component("student")
public class Student {
	private String name;
	private static int count;


	public Student() {
		System.out.println("Student default constructor, object " + incr() + " created");
	}

	private static int incr() {
		return ++count;
	}
}
