package com.lex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Lex Yu
 * @date : 2023/6/8
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/*
		SingletonDemo sgt1 = context.getBean("singletonDemo",SingletonDemo.class);
		SingletonDemo sgt2 = context.getBean("singletonDemo",SingletonDemo.class);
		System.out.println("Singleton--------------------------------------------------------------------------------");
		System.out.printf("| sgt1 = %s\n", sgt1);
		System.out.printf("| sgt2 = %s\n", sgt2);
		System.out.printf("| sgt1 == sgt2: %s\n", sgt1 == sgt2);
		System.out.println("---------------------------------------------------------------------------------------\n");

		PrototypeDemo ptt1 = context.getBean("prototypeDemo", PrototypeDemo.class);
		PrototypeDemo ptt2 = context.getBean("prototypeDemo", PrototypeDemo.class);
		System.out.println("Prototype--------------------------------------------------------------------------------");
		System.out.printf("| ptt1 = %s\n", ptt1);
		System.out.printf("| ptt2 = %s\n", ptt2);
		System.out.printf("| ptt1 == sgt2: %s\n", ptt1 == ptt2);
		System.out.println("---------------------------------------------------------------------------------------\n");

		Student s1 = context.getBean("student", Student.class);
		s1.setName("No.1 Stu");
		Student s2 = context.getBean("student", Student.class);
		System.out.println("Student--------------------------------------------------------------------------------");
		System.out.printf("| s1 = %s\n", s1);
		System.out.printf("| s1 name = %s\n", s1.getName());
		System.out.printf("| s2 = %s\n", s2);
		System.out.printf("| s2 name = %s\n", s2.getName());
		System.out.printf("| s1 == s2: %s\n", s1 == s2);
		System.out.println("---------------------------------------------------------------------------------------\n");
		 */

        School schoolObj1 = context.getBean("school", School.class);
        School schoolObj2 = context.getBean("school", School.class);
        System.out.printf("""
                schoolObj1={%s}, schoolObj1.getStudent()={%s}
                """, schoolObj1, schoolObj1.getStudent());
        System.out.printf("""
                schoolObj2={%s}, schoolObj2.getStudent()={%s}
                """, schoolObj2, schoolObj2.getStudent());


    }
}
