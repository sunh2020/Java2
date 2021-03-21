package com.sunh.lookify.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sunh.lookify.models.Lookify;
import com.sunh.lookify.repositories.LookifyRepo;

@Service
public class LookifyService {
private final LookifyRepo lookifyRepo;

public LookifyService(LookifyRepo lookifyRepo) {
    this.lookifyRepo = lookifyRepo;
 
}
public List<Lookify> allLookify() {
    return lookifyRepo.findAll();
}
}