package com.bnp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("welcome.xml");
		Welcome welc = (Welcome) context.getBean("wel");  // DI
		System.out.println(welc.sayHello());

	}

}
