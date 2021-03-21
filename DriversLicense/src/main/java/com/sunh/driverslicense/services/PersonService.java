package com.sunh.driverslicense.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunh.driverslicense.models.Person;
import com.sunh.driverslicense.repositories.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public List<Person> allPersons(){
		return personRepo.findAll();
	}
	
	public Person createPerson(Person person){
		return personRepo.save(person);
	}
	
	public Person findPerson(Long id){
		Optional<Person> optionalPerson = personRepo.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}	
	}	
	public Person updatePerson(Person p, Long id) {
	    	Optional<Person> newp = personRepo.findById(id);
	    	newp.get().setId(p.getId());
	    	newp.get().setFirstName(p.getFirstName());
	    	newp.get().setLastName(p.getLastName());
	    	return personRepo.save(newp.get());
	    }
	public Person updateLicense2(Long id, String firstName, String lastName) {
	     	Optional<Person> optionalLicense = personRepo.findById(id);
	    	if(optionalLicense.isPresent()) {
	    		Person license = optionalLicense.get();
	    		license.setId(id);
	    		license.setFirstName(firstName);
	    		license.setLastName(lastName);
	    		return personRepo.save(license);
	       } else {
	            return null;
	      }
	}
	
}
