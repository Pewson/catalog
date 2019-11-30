package com.msym.catalog.services;

import com.msym.catalog.clothing.Hat;
import com.msym.catalog.clothing.Pants;
import com.msym.catalog.repositories.PantsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PantsService {
    private PantsRepository pantsRepository;

    @Autowired
    PantsService(PantsRepository PantsRepository) {
        this.pantsRepository = pantsRepository;
    }

    public List<Pants> findAll(){
        return pantsRepository.findAll();
    }

    public void savePants(Pants pants){
        pantsRepository.save(pants);
    }
}
