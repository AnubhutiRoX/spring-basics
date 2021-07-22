package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private Random r = new Random();
	String[] data = {
			"beware",
			"lucky",
			"walk"
	};
	
	@Override
	public String getDailyFortune() {
		return data[r.nextInt(2)];
	}

}
