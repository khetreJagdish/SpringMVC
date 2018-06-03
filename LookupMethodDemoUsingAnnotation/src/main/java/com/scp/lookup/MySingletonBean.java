package com.scp.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

public class MySingletonBean {
	
	@Lookup
	public MyPrototypeBean getPrototypeBean() {
		
		return null;
	}
	

	public void showMessage() {
		MyPrototypeBean myPrototypeBean = getPrototypeBean();
		System.out.println("The Time is  : " + myPrototypeBean.getDateTime());
	}
}
