package com.example.backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.User;
import com.example.backend.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/v1/user")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public void addUsers(@RequestBody User user){
        this.userService.addUser(user);
    }

    @PostMapping(path = "find")
    public List<User> getUserByUsername(@RequestBody User user){
        return userService.getUserByUsername(user.getUserName(),user.getPassword());
    }

     
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    
    
}
