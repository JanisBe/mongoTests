package com.example.mongodbtests.drugiCase.repo;

import com.example.mongodbtests.drugiCase.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
    Hotel findByName(String name);
}