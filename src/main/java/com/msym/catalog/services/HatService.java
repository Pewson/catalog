package com.msym.catalog.services;

import com.msym.catalog.clothing.Hat;
import com.msym.catalog.repositories.HatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HatService {
    private HatsRepository hatsRepository;

    @Autowired
    HatService(HatsRepository hatsRepository) {
        this.hatsRepository = hatsRepository;
    }

    public List<Hat> findAll(){
        return hatsRepository.findAll();
    }

    public void saveHat(Hat hat){
        hatsRepository.save(hat);
    }


}
