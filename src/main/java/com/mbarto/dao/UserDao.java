package com.mbarto.dao;

import com.mbarto.model.User;

import java.util.List;

public interface UserDao {
    long save(User user);
    User get(long id);
    List<User> list();
    void update(long id, User user);
    void delete(long id);
    void delete();
}
