package com.sunh.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sunh.languages.models.Languages;

@Repository
public interface LanguagesRepo extends CrudRepository<Languages, Long>{
	 
    List<Languages> findAll();
    
}
