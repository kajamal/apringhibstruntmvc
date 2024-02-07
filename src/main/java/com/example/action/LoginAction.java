package com.example.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String phoneNumber;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String execute() {
        if (isValidUser()) {
            return SUCCESS;  // Successful login
        } else {
            addActionError("Invalid credentials. Please try again.");
            return INPUT;  // Unsuccessful login
        }
    }

    private boolean isValidUser() {
        return username != null && !username.isEmpty() && phoneNumber != null && !phoneNumber.isEmpty();
    }
}

