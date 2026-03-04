package com.pankaj.boot.firstjpaapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts 
{
	@Id
	@Column(name="contactid")
	int contactId;
	
	@Column(name="firstname")
	String firstName;
	@Column(name="lastname")
	String lastName;
	@Column(name="address1")
	String address1;
	@Column(name="address2")
	String address2;
	@Column(name="city")
	String city;
	@Column(name="pincode")
	String pincode;
	@Column(name="email")
	String email;
	@Column(name="mobile")
	String mobile;
	
	
}
