package com.pankaj.boot.firstjpaapp.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pankaj.boot.firstjpaapp.dto.ContactsDTO;
import com.pankaj.boot.firstjpaapp.entity.Contacts;
import com.pankaj.boot.firstjpaapp.repository.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {

	// JPA REPOSITORIES
	
	@Autowired
	ContactsRepository contactsRepo;	
	
	@Override
	public boolean addContact(ContactsDTO dto) 
	{
		Contacts objContacts = new Contacts();
		BeanUtils.copyProperties(dto, objContacts);
		contactsRepo.save(objContacts);
		
		return true;
	}

	@Override
	public List<ContactsDTO> allContacts() {
		
		Iterator<Contacts> dbContacts = contactsRepo.findAll().iterator();
		
		ArrayList<ContactsDTO> list = new ArrayList<>();
		while(dbContacts.hasNext())
		{
			ContactsDTO dto = new ContactsDTO();
			BeanUtils.copyProperties(dbContacts.next(),dto);
			list.add(dto);
		}
		return list;
	}

}
