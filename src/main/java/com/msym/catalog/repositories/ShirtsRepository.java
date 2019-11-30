package com.msym.catalog.repositories;

import com.msym.catalog.clothing.Shirt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShirtsRepository extends MongoRepository<Shirt, String> {
}
