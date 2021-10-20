package com.varun.anno;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Be win",
			"Not worry",
			"Be the best",
			"Get done"
	};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		return data[index];
	}

}
