package com.rono.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	
	private String[] data = {
		"Mother nature",
		"sister nature",
		"brother nature"
	};
	
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);

		return data[index];
	}

}
