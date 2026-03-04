package org.pankaj.jpa.firsthibernateapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

public class Users 
{
	String userName;
	
	String password;
	
	String name;
	
	String email;
	
	String mobile;
	
	String role;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public Users(String userName, String password, String name, String email, String mobile, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.role = role;
	}

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

	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", mobile=" + mobile + ", role=" + role + "]";
	}
	
	
}
