package org.lex.practice.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 */
@Aspect
@Component
public class Tracker {
	@Before(value = "")
	public void LogBeforeMethodCall() {
		System.out.println("Executed Thi Line Before Any Method");
	}
}
