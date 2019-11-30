package com.msym.catalog.repositories;

import com.msym.catalog.clothing.Hat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HatsRepository extends MongoRepository<Hat, String> {
}
