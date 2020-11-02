package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ExerciseFortuneService implements FortuneService {
	
	static String fileName = "Fortunes.txt";
    ClassLoader classLoader = getClass().getClassLoader();	
	File file = new File(classLoader.getResource(fileName).getFile());
	static Scanner scanner;
	static int currentArraySize= 5;
	static int currentLocation = 0;
	static String[] data = new String[currentArraySize];
	
	public ExerciseFortuneService() {
		
		try {
			ExerciseFortuneService.scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private void populateFortunes() {
		try {
		while(scanner.hasNextLine()) {
			data[currentLocation]= scanner.nextLine();
			currentLocation = currentLocation + 1;
		}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.err.print("Please check for an empty file "+file.getName());
		}
	}

	@Override
	public String getFortune() {
		
		  populateFortunes(); // create a random number generator 
		  Random myRandom = new Random(); // pick a random string from the array 
		  int index = myRandom.nextInt(data.length); String theFortune = data[index]; 
		  return theFortune;
	}

}
