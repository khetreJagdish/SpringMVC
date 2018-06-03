package com.scp.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("user1")
public class User1  implements UserInterface{
	
	public void userName() {
		System.out.println("User1 Name is  Amol");
		
	}

	public void userPhoneNumber() {
			System.out.println("User1 Number is 96307");
	}
	

}
