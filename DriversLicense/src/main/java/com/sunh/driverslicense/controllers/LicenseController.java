package com.sunh.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunh.driverslicense.models.License;
import com.sunh.driverslicense.models.Person;
import com.sunh.driverslicense.services.LicenseService;
import com.sunh.driverslicense.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;
    public LicenseController (LicenseService licenseService, PersonService personService){
        this.licenseService = licenseService;
        this.personService = personService;
    }
//other methods removed for brevity
    
    @RequestMapping("/licenses/new")
	    public String index(Model model, @ModelAttribute("license") License newlice) {
	        List<Person> person = personService.allPersons();
	        model.addAttribute("persons", person);
	        return "licenses.jsp";
}
//    @RequestMapping("/licenses/new")
//    public String newLicense(@ModelAttribute("license") License newlice) {
//    	return "new.jsp";
//    }
    @RequestMapping(value="/licenses/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("license") License newlice, BindingResult result) {
        if (result.hasErrors()) {
        	return "licenses.jsp";
        } else {
        	License newlice2 = licenseService.createLicense(newlice);
        	String setNumber = "00000" + newlice2.getId();
        	newlice2.setNumber(setNumber);
        	licenseService.createLicense(newlice2);
            return "redirect:/licenses/new";
        }
    }
//    @RequestMapping("/licenses/{id}")
//    public String showLicense(@PathVariable("id") Long id, Model model) {
//    	model.addAttribute("licenses", licenseService.findLicense(id));
//        return "show.jsp";
//    }
    
//    @RequestMapping("/licenses/{id}/edit")
//    public String editLicense(@PathVariable("id") Long id, Model model) {
//    	License license = licenseService.findLicense(id);
//        model.addAttribute("license", license);
//        return "edit.jsp";
//    }
//    
//    @RequestMapping(value="/licenses/{id}/update", method=RequestMethod.POST)
//    public String updateLicense(@PathVariable("id") String id,
//    		@Valid @ModelAttribute("license") License newlice, BindingResult result) {
//        if (result.hasErrors()) {
//            return "edit.jsp";
//        } else {
//        	Long e = Long.parseLong(id);
//          	licenseService.updateLicense(newlice, e);
////        	languagesService.updateLanguages3(id, language.getName(), language.getCreator(), language.getVersion());
//            return "redirect:/license";
//        }
//    }
}
