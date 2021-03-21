package com.sunh.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunh.driverslicense.models.Person;
import com.sunh.driverslicense.services.PersonService;


@Controller
public class PersonController {
	 
	private final PersonService personService;
    public PersonController (PersonService personService){
        this.personService = personService;
    }    
    
//other methods removed for brevity
    
//    @RequestMapping("/persons")
//	    public String index(@ModelAttribute("person") Person newperson) {
//	       return "persons.jsp";

    @RequestMapping("/persons/new")
    public String index(@ModelAttribute("person") Person newperson) {
    	return "persons.jsp";
    }
    @RequestMapping(value="/persons/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("person") Person newperson, BindingResult result) {
        if (result.hasErrors()) {
        	return "persons.jsp";
        } else {
        	personService.createPerson(newperson);
            return "redirect:/licenses/new";
        }
    }
    @RequestMapping("/persons/{id}")
    public String showPerson(@PathVariable("id") Long id, Model model) {
    	model.addAttribute("person", personService.findPerson(id));
        return "show.jsp";
    }
    
//    @RequestMapping("/persons/{id}/edit")
//    public String editPerson(@PathVariable("id") Long id, Model model) {
//    	Person person = personService.findPerson(id);
//        model.addAttribute("person", person);
//        return "edit.jsp";
//    }
//    
//    @RequestMapping(value="/persons/{id}/update", method=RequestMethod.POST)
//    public String updatePerson(@PathVariable("id") String id,
//    		@Valid @ModelAttribute("persons") Person newperson, BindingResult result) {
//        if (result.hasErrors()) {
//            return "edit.jsp";
//        } else {
//        	Long n = Long.parseLong(id);
//          	personService.updatePerson(newperson, n);
////        	languagesService.updateLanguages3(id, language.getName(), language.getCreator(), language.getVersion());
//            return "redirect:/persons";
//        }
//    }
}
