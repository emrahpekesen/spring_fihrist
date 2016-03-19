package com.aep.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.spring.model.EmailAddress;
import com.aep.spring.model.EmailAddressType;
import com.aep.spring.model.Person;
import com.aep.spring.model.PersonGender;

@RestController
public class PersonController {
	
	@Autowired
	private Person p;
	
	@RequestMapping("/personVer")
	public Person getSamplePerson(){
		
		
		p.setPersonID(121515L);
		p.setName("Emrah");
		p.setSurname("PEKESEN");
		p.setGender(PersonGender.MALE);

		List<EmailAddress> emails = new ArrayList<>();
		emails.add(new EmailAddress().setEmailAddressID(1L).setEmailAddress("emrahpekesen@gmail.com").setPreferred(true)
				.setEmailAddressType(EmailAddressType.PERSONAL));
		
		p.setEmails(emails);
		return p;
	}


}
