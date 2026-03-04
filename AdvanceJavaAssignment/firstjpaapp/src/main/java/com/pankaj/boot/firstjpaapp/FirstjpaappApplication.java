package com.pankaj.boot.firstjpaapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pankaj.boot.firstjpaapp.dto.ContactsDTO;
import com.pankaj.boot.firstjpaapp.services.ContactsService;

@SpringBootApplication(scanBasePackages={
	"com.pankaj.boot.firstjpaapp.services"
})
@EntityScan(basePackages = {"com.pankaj.boot.firstjpaapp.entity"})
@EnableJpaRepositories(basePackages = {"com.pankaj.boot.firstjpaapp.repository"})
public class FirstjpaappApplication implements CommandLineRunner 
{
	@Autowired
	ContactsService contactsService;	

	public static void main(String[] args) {
		SpringApplication.run(FirstjpaappApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception 
	{
		ContactsDTO dto = new ContactsDTO(351,"CDAC","asdf","asdf","dasf","Pune","411111","cdac@cdac","8797964");
		contactsService.addContact(dto);
		
	}

	private void showAll() {
		List<ContactsDTO> allContacts = contactsService.allContacts();
	
		for(ContactsDTO dto : allContacts)
		{
			System.out.println(dto);
		}
	}

}











