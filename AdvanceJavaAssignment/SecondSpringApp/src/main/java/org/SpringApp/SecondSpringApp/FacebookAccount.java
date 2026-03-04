package org.SpringApp.SecondSpringApp;

import org.SpringApp.SecondSpringApp.beans.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FacebookAccount implements Account {

	@Autowired
	@Qualifier("facebookUser")
	Users objUsers;
	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createAccount(String username, String password, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "FacebookAccount [objUsers=" + objUsers + "]";
	}
	
	

}
