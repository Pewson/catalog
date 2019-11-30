package com.msym.catalog.repositories;

import com.msym.catalog.clothing.Pants;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PantsRepository extends MongoRepository<Pants,String> {
}
