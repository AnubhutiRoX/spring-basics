package com.luv2code.springdemo;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	private final static Logger LOGGER = Logger.getLogger(HelloSpringApp.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lod spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// call method in bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
