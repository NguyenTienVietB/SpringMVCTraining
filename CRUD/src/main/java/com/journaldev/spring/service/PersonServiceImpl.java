package com.journaldev.spring.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.journaldev.spring.model.PersonModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.entity.Person;


@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional
	public void addPerson(PersonModel p) {

		Person person = new Person();
		BeanUtils.copyProperties(p, person);
		this.personDAO.addPerson(person);



	}

	@Override
	@Transactional
	public void updatePerson(PersonModel p) {

		Person person = new Person();
		BeanUtils.copyProperties(p, person);
		this.personDAO.updatePerson(person);
	}

	@Override
	@Transactional
	public List<PersonModel> listPersons() {

		List<PersonModel> userModelList = new ArrayList<PersonModel>();
		try {
			List<Person> userList = personDAO.listPersons();
			for (Person person : userList) {
				PersonModel personModel = new PersonModel();
				BeanUtils.copyProperties(person, personModel);
				userModelList.add(personModel);
			}
			return userModelList;
		} catch (Exception e) {

			return Collections.emptyList();
		}

	}

	@Override
	@Transactional
	public PersonModel getPersonById(int id) {

		PersonModel personModel = new PersonModel();
		try {
			Person person = personDAO.getPersonById(id);
			BeanUtils.copyProperties(person, personModel);
			return personModel;
		} catch (Exception e) {

			return personModel;
		}
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}

}
