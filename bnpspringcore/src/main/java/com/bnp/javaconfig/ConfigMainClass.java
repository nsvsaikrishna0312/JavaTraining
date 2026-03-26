package com.bnp.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMainClass {
	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		GreetingService gs=(GreetingService) context.getBean("gs1");
		gs.sayHi();
		
	}

}
