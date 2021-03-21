package com.sunh.driverslicense.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunh.driverslicense.models.License;
import com.sunh.driverslicense.repositories.LicenseRepo;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepo licenseRepo;
	
	public List<License> allLicense(){
		return licenseRepo.findAll();
	}
	
	public License createLicense(License license){
		return licenseRepo.save(license);
	}
	
	public License findLicense(Long id){
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}	
	public License updateLicense(License l, Long id) {
	    	Optional<License> newlicense = licenseRepo.findById(id);
	    	newlicense.get().setId(l.getId());
	    	newlicense.get().setNumber(l.getNumber());
	    	newlicense.get().setExpirationDate(l.getExpirationDate());
	    	newlicense.get().setState(l.getState());
	    	
	    	return licenseRepo.save(newlicense.get());
	    }
	public License updateLicense2(Long id, String number, Date expirationDate, String state) {
	     	Optional<License> optionalLicense = licenseRepo.findById(id);
	    	if(optionalLicense.isPresent()) {
	    		License license = optionalLicense.get();
	    		license.setId(id);
	    		license.setNumber(number);
	    		license.setExpirationDate(expirationDate);
	    		license.setState(state);
	    		return licenseRepo.save(license);
	       } else {
	            return null;
	      }
	}	
}
