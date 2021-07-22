package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get spring beans
		Coach tennis = context.getBean("tennisCoach", Coach.class);
		
		// use method on beans
		System.out.println(tennis.getDailyWorkout());
		System.out.println(tennis.getDailyFortune());
		// close the context
		context.close(); 
	}

}
