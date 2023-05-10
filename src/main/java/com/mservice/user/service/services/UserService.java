package com.mservice.user.service.services;

import com.mservice.user.service.entities.User;

import java.util.List;

public interface UserService {

    //Create user
    User saveUser(User user);

    //Get all users
    List<User> getAllUser();

    //Get single user of a given userId
    User getUser(String userId);
}
