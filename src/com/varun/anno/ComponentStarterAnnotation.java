package com.varun.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentStarterAnnotation {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//If you want to use default bean ID then remove the alias from @Component and just put the first letter as lower case of the class rest same
		// here it will be tennisCoach for TennisCoach class
		//Coach coach = context.getBean("tennisCoachBean",Coach.class);
		
		//Using default bean
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
