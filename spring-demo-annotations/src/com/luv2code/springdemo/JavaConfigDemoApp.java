package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get spring beans
		Coach tennis = context.getBean("tennisCoach", Coach.class);
		
		// use method on beans
		System.out.println(tennis.getDailyWorkout());
		System.out.println(tennis.getDailyFortune());
		// close the context
		context.close(); 
	}

}
