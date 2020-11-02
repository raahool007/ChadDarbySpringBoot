package com.luv2code.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Samosa implements Edible {

	@Override
	public String onEat() {
		return "Burppp";
	}

}
