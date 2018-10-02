package com.mbarto.service;

import com.mbarto.dao.UserDao;
import com.mbarto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    UserDao userDao;

    public List<User> findAllUsers() {
        return userDao.list();
    }

    public User findById(long id) {
        return userDao.get(id);
    }

    public User findByLastname(String lastname) {
        return null;
    }

    @Transactional
    public long saveUser(User user) {
        return userDao.save(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDao.update(user.getId(), user);
    }

    @Transactional
    public void deleteUserById(long id) {

        userDao.delete(id);
    }

    public boolean isUserExist(User user) {
        return findByLastname(user.getLastname()) != null;
    }

    public void deleteAllUsers() {
    }

}