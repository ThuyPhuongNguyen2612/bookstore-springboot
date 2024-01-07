package com.practice.bookstore.repository;

import com.practice.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();
    User getByUserID(Long userID);

}
