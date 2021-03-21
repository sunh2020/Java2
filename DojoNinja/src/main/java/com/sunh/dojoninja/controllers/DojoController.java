package com.sunh.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunh.dojoninja.models.Dojo;
import com.sunh.dojoninja.services.DojoService;
import com.sunh.dojoninja.services.NinjaService;

@Controller
public class DojoController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
    public DojoController (DojoService dojoService, NinjaService ninjaService){
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
}
    @RequestMapping("/dojos/new")
    public String index(@ModelAttribute("dojo") Dojo dojo) {
           return "dojos.jsp";
 }
	@RequestMapping(value="/dojos/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("dojo") Dojo newdojo, BindingResult result) {
	    if (result.hasErrors()) {
	    	return "dojos.jsp";
	    } else {
	    	dojoService.createDojo(newdojo);
	        return "redirect:/ninjas/new";
	    }
}
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.findDojo(id));
		model.addAttribute("ninja", ninjaService.findNinja(id));
	    return "show.jsp";
	}
}	
