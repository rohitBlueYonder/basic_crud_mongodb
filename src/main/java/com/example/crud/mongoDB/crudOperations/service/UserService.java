package com.example.crud.mongoDB.crudOperations.service;

import com.example.crud.mongoDB.crudOperations.model.User;
import com.example.crud.mongoDB.crudOperations.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserService {

    private UserRepository userRepository;
    private User user;

    public UserService(){

    }

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public String saveUser(User user, HttpServletResponse response)throws JsonProcessingException {
        JsonObject responseJSON = new JsonObject();
        ObjectMapper mapper= new ObjectMapper()
    }

}
