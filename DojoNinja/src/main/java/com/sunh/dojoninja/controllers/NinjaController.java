package com.sunh.dojoninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunh.dojoninja.models.Dojo;
import com.sunh.dojoninja.models.Ninja;
import com.sunh.dojoninja.services.DojoService;
import com.sunh.dojoninja.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
    public NinjaController (NinjaService ninjaService, DojoService dojoService){
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
}
    @RequestMapping("/ninjas/new")
    public String index(Model model, @ModelAttribute("ninja") Ninja newninja) {
        List<Dojo> dojo = dojoService.allDojos();
        model.addAttribute("dojo", dojo);
        return "ninjas.jsp";
 }
    @RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("ninjas") Ninja newninja, BindingResult result) {
        if (result.hasErrors()) {
        	return "ninjas.jsp";
        } else {
        	ninjaService.createNinja(newninja);
            return "redirect:/ninjas/new";
        }
    }   
}    
