package com.luv2code.springdemo;

public class AkhadaCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public AkhadaCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Perform 1000 dandas and bethakas";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
