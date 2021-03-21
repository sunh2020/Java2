package com.sunh.languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.sunh.languages.models.Languages;
import com.sunh.languages.repositories.LanguagesRepo;

@Service
public class LanguagesService {
	  // adding the book repository as a dependency
    private final LanguagesRepo languagesRepo;
    
    public LanguagesService(LanguagesRepo languagesRepo) {
        this.languagesRepo = languagesRepo;
    }
    // returns all the Languages
    public List<Languages> allLanguages() {
        return languagesRepo.findAll();
    }
    // creates a Language
    public Languages createLanguages(Languages language) {
        return languagesRepo.save(language);
    }
    // updates a Language
    public Languages updatelanguage2(Languages l, Long id) {
    	Optional<Languages> newlang = languagesRepo.findById(id);
    	newlang.get().setCreator(l.getCreator());
    	newlang.get().setName(l.getName());
    	newlang.get().setVersion(l.getVersion());
    	return languagesRepo.save(newlang.get());
    }
    public Languages updateLanguages3(Long id, String name, String creator, String version) {
    	Optional<Languages> optionalLanguages = languagesRepo.findById(id);
    	if(optionalLanguages.isPresent()) {
    		Languages languages = optionalLanguages.get();
    		languages.setName(name);
    		languages.setCreator(creator);
    		languages.setVersion(version);
    		return languagesRepo.save(languages);
        } else {
            return null;
        }
       }
        
    // retrieves a Language
    public Languages findLanguages(Long id) {
        Optional<Languages> optionalLanguages = languagesRepo.findById(id);
        if(optionalLanguages.isPresent()) {
            return optionalLanguages.get();
        } else {
            return null;
        }
    }
    // deletes a Language
    public void deleteLanguages(Long id) {
    	languagesRepo.deleteById(id);
    }
//    public void updateLanguages(@Valid Languages language) {
//    	updateLanguages3(language.getId(), language.getName(), language.getCreator(), language.getVersion());
//	}
    
}

























//@Autowired
//private [MODEL]Repository [model]Repository;
//
//public List<[MODEL]> all[MODEL]s(){
//	return [model]Repository.findAll();
//}
//
//public [MODEL] create[MODEL]([MODEL] [model]){
//	return [model]Repository.save([model]);
//}
//
//public [MODEL] find[MODEL](Long id){
//	Optional<[MODEL]> optional[MODEL] = [model]Repository.findById(id);
//	if(optional[MODEL].isPresent()) {
//		return optional[MODEL].get();
//	} else {
//		return null;
//	}
//}