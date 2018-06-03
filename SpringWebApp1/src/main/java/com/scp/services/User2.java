package com.scp.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("user2")
public class User2  implements UserInterface{

	public void userName() {
		System.out.println("User2 NAme is  Jagdish");
		
	}

	public void userPhoneNumber() {
			System.out.println("User2 Number is 9637171607");
	}
	

}
