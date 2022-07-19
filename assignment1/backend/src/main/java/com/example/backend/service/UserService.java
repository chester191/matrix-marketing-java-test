package com.example.backend.service;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.backend.dao.UserDao;

import com.example.backend.model.User;
@Service
public class UserService {
 

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("postgres")UserDao userDao) {
        this.userDao = userDao;
    }
    public int addUser(User user){
        return userDao.insertUser(user);
    }

    public List<User> getAllUsers(){
        return this.userDao.selectAllUsers();
    }
    
    public List<User> getUserByUsername(String u,String p){
        return this.userDao.getUserByUsername(u, p);
    }
}   
