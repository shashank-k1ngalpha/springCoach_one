package com.demo.springdemo;

public class MyApp {
	public static void main(String[] args) {
		
		//create the object
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		//use the object
	}
}
