package com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.domain.User;



public interface UserRepository extends MongoRepository<User, String>{

}
