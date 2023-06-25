package com.lex;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private Student student;

	public School() {
		System.out.println("School default constructor, object " + incr() + " created");
	}

	private static int incr() {
		return ++count;
	}

	// Student is prototype,
	// return a new object each time it gets called
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
