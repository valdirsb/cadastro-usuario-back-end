package com.projeto1.repository;

import com.projeto1.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,String> {
    
}
