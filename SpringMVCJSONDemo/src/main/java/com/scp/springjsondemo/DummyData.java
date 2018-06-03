package com.scp.springjsondemo;

import java.util.ArrayList;
import java.util.List;

public class DummyData {

	public static List<User> getListOfUsers(){
		 List<User> listOfUsers = new ArrayList<User>();
		 for(int i=1;i<20;i++){
			 listOfUsers.add(new User(new Long(i),"Abc"+i,"PQR"+i,"abc"+i+"@xyz.com"));
		 }
		return listOfUsers;
		
	}
	
}
