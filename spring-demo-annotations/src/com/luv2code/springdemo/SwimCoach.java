package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	FortuneService fs;
	
	SwimCoach(FortuneService fs) {
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm ip!";
	}

	@Override
	public String getDailyFortune() {
		return this.fs.getDailyFortune();
	}

}
