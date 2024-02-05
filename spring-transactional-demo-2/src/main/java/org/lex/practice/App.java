package org.lex.practice;

import org.lex.practice.config.TransConfig;
import org.lex.practice.service.ItemService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(TransConfig.class);
		context.registerShutdownHook();

		ItemService itemService = context.getBean("itemService", ItemService.class);
		try {
			itemService.saveItemInfo();
		} catch (Exception ex) {
			Arrays.stream(ex.getStackTrace()).forEach(System.out::println);
		}

		context.close();
	}
}
