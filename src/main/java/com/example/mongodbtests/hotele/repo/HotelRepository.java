package com.example.mongodbtests.hotele.repo;

import com.example.mongodbtests.hotele.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
    Hotel findByName(String name);
}