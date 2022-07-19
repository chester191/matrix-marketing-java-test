package com.example.backend.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.backend.model.User;
@Repository("wrapperDao")
public class WrapperUserDataAccessService implements UserDao{
    private static List<User> DB = new ArrayList<>();

    @Override
    // public int insertUser(String u, String p){
    public int insertUser(User user, String p){
        // TODO Auto-generated method stub
        DB.add(new User(user.getUserName(),p));
        return 1;
    }



    @Override
    public List<User> selectAllUsers() {
        // TODO Auto-generated method stub
        return DB;
    }



    @Override
    public Optional<User> selectUserByUsername(String u) {
        // TODO Auto-generated method stub
        return DB.stream()
                .filter(user-> user.getUserName().equals(u))
                .findFirst();
    }



    @Override
    public List<User> getUserByUsername(String u, String p) {
        // TODO Auto-generated method stub
        return null;
    } 
    


}