package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method from bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		// call our getter method to get literal values
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		// close the context
		context.close();
	}

}
