package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	// init-method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: iside method doMyStartupStuff");
	}
	
	// destroy-method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: iside method doMyCleanupStuff");
	}
}
