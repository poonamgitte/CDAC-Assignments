package org.hbn.FirstHybernateApp;

public class User {
	
	String username;
	String password;
	String name;
	String email;
	String mobile;
	String role;
	
	public User() {
		
	}
	
	public User(String username, String password,String name,String email,String mobile,String role) {
		
		this.username = username;
		this.password =password;
		this.name =name;
		this.email = email;
		this.mobile =mobile;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
