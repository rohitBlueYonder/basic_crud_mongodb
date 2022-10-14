package com.example.crud.mongoDB.crudOperations.repository;

import com.example.crud.mongoDB.crudOperations.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {

    List<User> findByName(String name);
    User findById(int id);

}
