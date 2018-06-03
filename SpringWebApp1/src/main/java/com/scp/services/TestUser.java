package com.scp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestUser {
	
	@Autowired
	@Qualifier("user2")
	private  UserInterface userInterface;
	
	@Qualifier("user1")
	private  UserInterface userInterface2;
	
	public void service() {
		userInterface.userName();
		userInterface.userPhoneNumber();
	}
}


