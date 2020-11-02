package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");		
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		
		// call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	
		
		
		// close the context
		context.close();

	}

}
