package com.mbarto.service;

import com.mbarto.model.User;

import java.util.List;




public interface UserService {

    User findById(long id);

    User findByLastname(String lastname);

    long saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

}
