package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		int random = ((int) Math.floor((Math.random() * 10))) % 3;
		String[] fortunes = {"You are so lucky", "You are doomed", "Wow."};
		return fortunes[random];
	}

}
