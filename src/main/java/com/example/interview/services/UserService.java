package com.example.interview.services;


import com.example.interview.entities.User;
import com.example.interview.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsersByCompany(){
        //TODO:Impl: get users by company, excluding admins
        throw new UnsupportedOperationException("Unimplemented");
    }
}
