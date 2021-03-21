package com.sunh.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sunh.lookify.models.Lookify;

@Repository
public interface LookifyRepo extends CrudRepository<Lookify, Long>{
	List<Lookify> findAll();
}

