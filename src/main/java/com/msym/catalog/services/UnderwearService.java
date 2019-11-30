package com.msym.catalog.services;

import com.msym.catalog.clothing.Underwear;
import com.msym.catalog.repositories.UnderwearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnderwearService {

        private UnderwearRepository underwearRepository;

        @Autowired
        public UnderwearService(UnderwearRepository underwearRepository) {
            this.underwearRepository = underwearRepository;
        }

        public List<Underwear> findAll() {
            return underwearRepository.findAll();
        }

        public void saveUnderwear(Underwear underwear) {
            underwearRepository.save(underwear);
        }
}