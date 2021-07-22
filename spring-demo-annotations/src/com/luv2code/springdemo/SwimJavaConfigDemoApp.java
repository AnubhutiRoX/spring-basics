package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get spring beans
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// use method on beans
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println(swimCoach.getEmail() );
		// close the context
		context.close(); 
	}

}
