package com.sunh.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunh.languages.models.Languages;
import com.sunh.languages.services.LanguagesService;

@Controller
public class LanguagesController {
	private final LanguagesService languagesService;
    public LanguagesController(LanguagesService languagesService){
        this.languagesService = languagesService;
    }
//other methods removed for brevity
    
    @RequestMapping("/languages")
	    public String index(Model model, @ModelAttribute("language") Languages newlang) {
	        List<Languages> languages = languagesService.allLanguages();
	        model.addAttribute("languages", languages);
	        return "index.jsp";
}
    @RequestMapping("/languages/new")
    public String newLanguages(@ModelAttribute("language") Languages language) {
    	return "new.jsp";
    }
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Languages language, BindingResult result) {
        if (result.hasErrors()) {
        	return "new.jsp";
        } else {
        	languagesService.createLanguages(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping("/languages/{id}")
    public String showLanguage(@PathVariable("id") Long id, Model model) {
    	model.addAttribute("language", languagesService.findLanguages(id));
        return "show.jsp";
    }
    
    @RequestMapping("/languages/{id}/edit")
    public String editLanguage(@PathVariable("id") Long id, Model model) {
        Languages lang = languagesService.findLanguages(id);
        model.addAttribute("language", lang);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/languages/{id}/update", method=RequestMethod.POST)
    public String updateLanguage(@PathVariable("id") String id,
    		@Valid @ModelAttribute("language") Languages language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	Long lid = Long.parseLong(id);
          	languagesService.updatelanguage2(language, lid);
//        	languagesService.updateLanguages3(id, language.getName(), language.getCreator(), language.getVersion());
            return "redirect:/languages";
        }
    }
    @RequestMapping("/languages/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
        languagesService.deleteLanguages(id);
        return "redirect:/languages";
    }
}
