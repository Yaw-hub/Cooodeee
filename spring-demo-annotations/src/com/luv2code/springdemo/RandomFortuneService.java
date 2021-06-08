package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// Create an array of strings
	private String[] data = {
			"Beware of the Wolf in Sheep's clothing",
			"Dilligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// Create random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// Pick a random fortune the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
