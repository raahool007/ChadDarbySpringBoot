package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAssignmentApp {
	
	public static void main(String[] args) {
		
		// read the spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NewSportConfig.class);
		
		// Retrieve the bean from the spring container
		
		Coach theCoach = context.getBean("akhadaCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
	}

}
