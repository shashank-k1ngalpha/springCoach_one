package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//Print out the result
		System.out.println("\n Pointing to the same object: "+result);
		
		System.out.println("\n Memory location for theCoach: "+theCoach);
		
		System.out.println("\n Memory location for theCoach: "+alphaCoach);
		
		//Close the context
		context.close();
	}
	
}
