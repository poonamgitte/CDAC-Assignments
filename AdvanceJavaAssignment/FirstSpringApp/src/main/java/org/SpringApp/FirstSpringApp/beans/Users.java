package org.SpringApp.FirstSpringApp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("objUser")
public class Users {

	// use these value annotation with component-scan method
//	@Value("dac")
//	String userName;
//	
//	@Value("dac@12344")
//	String password;
	

	String userName;

	String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
