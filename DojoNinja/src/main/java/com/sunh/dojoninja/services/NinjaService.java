package com.sunh.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunh.dojoninja.models.Ninja;
import com.sunh.dojoninja.repositories.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo ninjaRepo;
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja){
		return ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id){
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}	
	}	
	public Ninja updateNinja(Ninja n, Long id) {
	    	Optional<Ninja> newn = ninjaRepo.findById(id);
	    	newn.get().setId(n.getId());
	    	newn.get().setFirstName(n.getFirstName());
	    	newn.get().setLastName(n.getLastName());
	    	newn.get().setAge(n.getAge());
	    	return ninjaRepo.save(newn.get());
	    }
	public Ninja updateLicense2(Long id, String firstName, String lastName, int age) {
	     	Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
	    	if(optionalNinja.isPresent()) {
	    		Ninja ninja = optionalNinja.get();
	    		ninja.setId(id);
	    		ninja.setFirstName(firstName);
	    		ninja.setLastName(lastName);
	    		ninja.setAge(age);
	    		return ninjaRepo.save(ninja);
	       } else {
	            return null;
	      }
	}
	
}