package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fs;
	
	/*
	 * @Autowired TennisCoach(FortuneService fs){ this.fs = fs; }
	 */
	
	/*
	 * @Autowired public void setFs(FortuneService fs) { this.fs = fs; }
	 */

	/*
	 * @Autowired public void anyMethod(FortuneService fs) { this.fs = fs; }
	 */
	
	// do startup stuff
//	@PostConstruct
//	public void doStartUptuff() {
//		System.out.println("TennisCach: inside doStartUp stuff");
//	}
//	
//	// do destroy stuff
//	@PreDestroy
//	public void doStartUptuff() {
//		System.out.println("TennisCach: inside doStartUp stuff");
//	}
	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fs.getDailyFortune();
	}

}
