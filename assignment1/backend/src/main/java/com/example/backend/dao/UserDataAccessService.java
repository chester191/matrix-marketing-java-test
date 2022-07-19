package com.example.backend.dao;
// import com.example.backend.User;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.backend.model.User;

@Repository("postgres")
public class UserDataAccessService implements UserDao {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(User user, String p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {
        // TODO Auto-generated method stub
        final String  sql = "SELECT * FROM user_tbl;"; 
        return jdbcTemplate.query(sql,(rs, i) -> {
            return new User(rs.getString("username"),rs.getString("pass"));
        });
        // return List.of(new User("FROM POSTGRES DB",""));
    }

   
    @Override
    public Optional<User> selectUserByUsername(String u) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public List<User> getUserByUsername(String u,String p) {
         // TODO Auto-generated method stub
         final String  sql = "SELECT * FROM user_tbl WHERE username='"+u+"' AND pass= '"+p+"';"; 
         return jdbcTemplate.query(sql,(rs, i) -> {
             return new User(rs.getString("username"),rs.getString("pass"));
         });
    }

    

}