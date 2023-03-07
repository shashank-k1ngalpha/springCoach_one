package com.demo.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Create a no arg constructor
	public CricketCoach() {
		System.out.println("Inside the constructor");
	}
	
	//add new fields for email and team
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside the setter method for set email address");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside the setter method for set team");
		this.team = team;
	}


	//Create setter method in your class for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting and bowling daily 30 minutes!";
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
}
