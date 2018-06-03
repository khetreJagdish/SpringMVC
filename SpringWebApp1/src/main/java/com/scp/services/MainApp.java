package com.scp.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.scp.services");
		applicationContext.refresh();
		
		TestUser testUser = applicationContext.getBean(TestUser.class);
		testUser.service();
		applicationContext.close();
	}

}
