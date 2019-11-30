package com.msym.catalog.repositories;

import com.msym.catalog.clothing.Underwear;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnderwearRepository extends MongoRepository<Underwear, String> {
}
