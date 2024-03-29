package com.example.model;

import javax.persistence.*;

@Entity
@Table (name ="login")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.password = phoneNumber;
    }
}
