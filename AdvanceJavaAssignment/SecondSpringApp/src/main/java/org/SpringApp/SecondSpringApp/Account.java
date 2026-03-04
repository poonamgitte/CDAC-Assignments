package org.SpringApp.SecondSpringApp;

public interface Account {
	public boolean authenticate(String username, String password);
	public boolean createAccount(String username,String password, String name);
}
