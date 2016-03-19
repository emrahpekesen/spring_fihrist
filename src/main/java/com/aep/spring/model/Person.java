package com.aep.spring.model;


import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Person {
	private Long personID;
	private String name;
	private String surname;
	private PersonGender gender;
	private List<EmailAddress> emails;
}
