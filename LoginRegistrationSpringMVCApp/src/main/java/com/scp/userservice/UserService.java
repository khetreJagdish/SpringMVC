package com.scp.userservice;

import java.sql.SQLException;

public interface UserService {
		
	public boolean isValidUser(String username, String password) throws SQLException ;
}
