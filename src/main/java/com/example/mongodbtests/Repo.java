package com.example.mongodbtests;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends MongoRepository<User, Integer> {
}
