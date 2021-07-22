package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get beans
		Coach tennisCoach = context.getBean("myTennisCoach", Coach.class);
		
		// access beans methods
		System.out.println(tennisCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
