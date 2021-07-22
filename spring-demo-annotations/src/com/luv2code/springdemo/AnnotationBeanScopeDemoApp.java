package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load pring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alternateTennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach == alternateTennisCoach); 

	}

}
