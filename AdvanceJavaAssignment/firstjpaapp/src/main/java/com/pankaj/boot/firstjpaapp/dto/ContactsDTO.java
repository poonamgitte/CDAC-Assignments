package com.pankaj.boot.firstjpaapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactsDTO {

	int contactId;

	String firstName;
	String lastName;
	String address1;
	String address2;
	String city;
	String pincode;
	String email;
	String mobile;
}
