package com.sunh.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunh.dojoninja.models.Dojo;
import com.sunh.dojoninja.repositories.DojoRepo;

@Service
public class DojoService {
	@Autowired
	private DojoRepo dojoRepo;
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo){
		return dojoRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id){
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}	
	}	
	public Dojo updateDojo(Dojo p, Long id) {
	    	Optional<Dojo> newp = dojoRepo.findById(id);
	    	newp.get().setId(p.getId());
	    	newp.get().setName(p.getName());
	    	return dojoRepo.save(newp.get());
	    }
	public Dojo updateLicense2(Long id, String name) {
	     	Optional<Dojo> optionalDojo = dojoRepo.findById(id);
	    	if(optionalDojo.isPresent()) {
	    		Dojo dojo = optionalDojo.get();
	    		dojo.setId(id);
	    		dojo.setName(name);
	    		return dojoRepo.save(dojo);
	       } else {
	            return null;
	      }
	}
	
}
