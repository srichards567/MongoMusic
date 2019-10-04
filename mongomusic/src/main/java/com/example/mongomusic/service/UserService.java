package com.example.mongomusic.service;

import com.example.mongomusic.model.User;

import java.util.List;

public interface UserService {

    /**
     * This method accepts newUser object
     * @param newUser
     * @return
     */
    public User createUser(User newUser);

    /**
     * This method accepts email String
     * @param email
     * @return returns user
     */
    public User findUserByEmail(String email);

    /**
     * This method lists all users
     * @return
     */
    public List<User> listUsers();
}
