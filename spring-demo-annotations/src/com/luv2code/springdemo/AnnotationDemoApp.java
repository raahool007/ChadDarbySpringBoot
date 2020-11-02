package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("yogaCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		// context.close();
		
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		//System.out.println(swimCoach.getEmail());
		context.close();
	
	}

}
