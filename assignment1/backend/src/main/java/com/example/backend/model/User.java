package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private final String userName;
    private final String password;
    
    public User(){
        userName = "";
        password = "";
    }
    public User(@JsonProperty("username") String u, 
                @JsonProperty("password") String p) {
        this.userName = u;
        this.password = p;
    }

    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }


}
