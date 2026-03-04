package org.SpringApp.SecondSpringApp;

import org.SpringApp.SecondSpringApp.beans.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AmazonAccount implements Account {

	@Autowired
	@Qualifier("amazonUser")
	Users objUsers;

	@Override
	public boolean authenticate(String username, String password) {
		
		return false;
	}

	@Override
	public boolean createAccount(String username, String password, String name) {
		
		return false;
	}

	@Override
	public String toString() {
		return "AmazonAccount [objUsers=" + objUsers + "]";
	}


	
}
