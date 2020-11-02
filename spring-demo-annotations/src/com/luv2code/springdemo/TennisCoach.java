package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	private void doMyStartupStuff() {
		System.out.println(">> TennisCoach: Inside doMyStartupStuff()");
		ExerciseFortuneService fs = new ExerciseFortuneService();
		System.out.println(fs.getFortune());
	}
	
	
	@PreDestroy
	private void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: Inside doMyCleanupStuff()");
		
	}
	
	/*
	 * 
	 * public TennisCoach(FortuneService theFortuneService) { fortuneService =
	 * theFortuneService; }
	 */

}
