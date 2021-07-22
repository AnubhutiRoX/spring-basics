package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minute on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
