package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach c = context.getBean("myCoach", Coach.class);
		
		Coach a = context.getBean("myCoach", Coach.class);
		
		System.out.println(a == c);
		
		System.out.println(a);
		
		System.out.println(c);
		
		context.close();
		
	}

}
