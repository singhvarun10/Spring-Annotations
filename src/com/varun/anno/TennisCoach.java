package com.varun.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tennisCoachBean")
@Component
//For same object everywhere
@Scope("singleton")
//For different object everywhere
//@Scope("prototype")
public class TennisCoach implements Coach {
	
//  Field injection, works on java reflection tech	
	@Autowired
//  To be specific for a particular service file implementing the same interface, 2 classes are implementing FortuneService
//	@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//  constructor injection using autowired
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//  For any method in the very first
	@PostConstruct
	public void doStartUp() {
		System.out.println("start up stuff");
	}

//  For any method in the very end
	@PreDestroy
	public void doEndUp() {
		System.out.println("end up stuff");
	}
	
	public TennisCoach() {
		System.out.println("Tennis coach constructor called");
	}
	
//  Setter autowired	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Tennis coach setter called");
//		this.fortuneService = fortuneService;
//	}
	
//  Method autowiring, can be done without setter method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("Tennis coach crazy stuff called");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Move your racket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
