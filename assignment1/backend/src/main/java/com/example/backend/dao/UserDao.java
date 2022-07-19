package com.example.backend.dao;
import java.util.List;
import java.util.Optional;

import com.example.backend.model.User;

public interface UserDao {
    int insertUser(User user,String p);
    default int insertUser(User user){
        String pass = "";
        return insertUser(user,pass);
    }

    List<User> selectAllUsers();

    Optional<User> selectUserByUsername (String u);

    List<User> getUserByUsername (String u,String p);

}
