package com.msym.catalog.repositories;

import com.msym.catalog.clothing.Clothing;
import com.msym.catalog.clothing.Hat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClothingRepository extends MongoRepository<Hat,String> {
}
