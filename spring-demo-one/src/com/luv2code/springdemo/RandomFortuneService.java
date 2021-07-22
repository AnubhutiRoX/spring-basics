package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortune = new String[3];
	@Override
	public String getFortune() {
		Random r = new Random();
		fortune[0] = "Your luck color is blue";
		fortune[1] = "Your luck date is 8";
		fortune[2] = "Your luck day is Sunday";
		// TODO Auto-generated method stub
		return fortune[r.nextInt(2)];
	}

}
