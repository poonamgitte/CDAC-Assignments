package com.pankaj.boot.firstjpaapp.services;

import java.util.List;

import com.pankaj.boot.firstjpaapp.dto.ContactsDTO;

public interface ContactsService 
{
	public boolean addContact(ContactsDTO dto);
	public List<ContactsDTO> allContacts();
}
