package com.sunh.languages.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunh.languages.models.Languages;
import com.sunh.languages.services.LanguagesService;

@RestController
public class LanguagesApi {
    private final LanguagesService languagesService;
    public LanguagesApi(LanguagesService languagesService){
        this.languagesService = languagesService;
    }
    @RequestMapping("/api/languages")
    public List<Languages> index() {
        return languagesService.allLanguages();
    }
    
    @RequestMapping(value="/api/languages", method=RequestMethod.POST)
    public Languages create(@RequestParam(value="name") String name, 
    				   @RequestParam(value="creator") String creator, 
    				   @RequestParam(value="version") String version) {
    	Languages language = new Languages(name, creator, version);
        return languagesService.createLanguages(language);
    }
    @RequestMapping(value="/api/languages/{id}", method=RequestMethod.PUT)
    public Languages update(@PathVariable("id") Long id, 
    		           @RequestParam(value="name") String name, 
    		           @RequestParam(value="creator") String creator, 
    		           @RequestParam(value="version") String version) {
        Languages language = languagesService.updateLanguages3(id, name, creator, version);
        return language;
    }
    
    @RequestMapping("/api/languages/{id}")
    public Languages show(@PathVariable("id") Long id) {
        Languages language = languagesService.findLanguages(id);
        return language;
    }
    @RequestMapping(value="/api/languages/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        languagesService.deleteLanguages(id);
    }
}