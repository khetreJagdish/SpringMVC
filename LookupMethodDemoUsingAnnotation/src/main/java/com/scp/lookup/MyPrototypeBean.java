package com.scp.lookup;

import java.time.LocalDateTime;

public class MyPrototypeBean {
	
	private static  String dateTimeString = LocalDateTime.now().toString();
	
	public String getDateTime() {
		return dateTimeString;
	}

}
