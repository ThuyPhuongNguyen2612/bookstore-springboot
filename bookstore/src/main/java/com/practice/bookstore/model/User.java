package com.practice.bookstore.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="userID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(name="name", nullable=true)
    private String name;

    @Column(name="gender", nullable=true)
    private String gender;

    @Column(name="email", nullable=false)
    private String email;

    @Column(name="password", nullable=false)
    private String password;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
