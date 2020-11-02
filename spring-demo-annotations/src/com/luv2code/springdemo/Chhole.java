package com.luv2code.springdemo;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Chhole implements Edible{
	
	@Override
	public String onEat() {
		return "Fart";
	}

}
