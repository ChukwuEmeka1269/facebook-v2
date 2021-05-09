package com.example.facebookv2.service;

import com.example.facebookv2.model.User;

public interface UserService {
    User getUserByEmail(String email);

    void addUser(User user);
}
