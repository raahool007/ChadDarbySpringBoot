package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach {
	
	@Autowired
	@Qualifier("exerciseFortuneService")
	private FortuneService fortuneService;
	
	public YogaCoach() {
		System.out.println(">> YogaCoach.class: Inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Do a slow full body stretching!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println(">> YogaCoach.class: Inside setFortuneService() method");
	 * this.fortuneService = theFortuneService; }
	 */

}
