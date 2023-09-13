package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.entity.Person;
import com.journaldev.spring.model.PersonModel;

public interface PersonService {

	public void addPerson(PersonModel p);
	public void updatePerson(PersonModel p);
	public List<PersonModel> listPersons();
	public PersonModel getPersonById(int id);
	public void removePerson(int id);
	
}
