package com.msym.catalog.services;

import com.msym.catalog.clothing.Shirt;
import com.msym.catalog.repositories.ShirtsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShirtService {

    private ShirtsRepository shirtsRepository;

    @Autowired
    public ShirtService(ShirtsRepository shirtsRepository) {
        this.shirtsRepository = shirtsRepository;
    }

    public List<Shirt> findAll() {
    return shirtsRepository.findAll();
    }

    public void saveShirt(Shirt shirt){
        shirtsRepository.save(shirt);
    }


}
