package com.demo.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run daily for 30 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It:" +fortuneService.getFortune();
	}
	
	// add the init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside init method");
		
	}
	
	//add the destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside destroy method");
	}

}















