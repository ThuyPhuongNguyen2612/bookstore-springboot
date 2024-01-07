package com.practice.bookstore.service;

import com.practice.bookstore.model.User;
import com.practice.bookstore.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;


    public List<User> getAllUsers () {
        return userRepository.findAll();
    }
    public int countUsers(){
        return userRepository.findAll().size();
    }

    public User getUserById(Long id){
        return userRepository.getByUserID(id);
    }

}
