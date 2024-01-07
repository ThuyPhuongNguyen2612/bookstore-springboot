package com.practice.bookstore.controller;

import com.practice.bookstore.model.User;
import com.practice.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Login {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String a(){
        return "hello";
    }
    @GetMapping("/listUsers")
    public List<User> findAllUsers() {
        return userService.getAllUsers();
    }

}
