package org.cdac.web.users;

public class Users {
	
     private String username;
     private String password;
     private String name;
     private String email;
     private String city;
     private String role;
     
	 public Users(String username, String password, String name, String email, String city, String role) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.city = city;
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

	 public String getCity() {
		 return city;
	 }

	 public void setCity(String city) {
		 this.city = city;
	 }

	 public String getRole() {
		 return role;
	 }

	 public void setRole(String role) {
		 this.role = role;
	 }
     
}
