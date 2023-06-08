package com.lex;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @date : 2023/6/8
 */
@Component
@Scope("singleton")
public class School {
	private static int count;

	public School() {
		System.out.println("School default constructor, object " + incr() + " created");
	}

	private static int incr() {
		return ++count;
	}
}
