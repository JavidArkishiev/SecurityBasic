package com.example.securtiynew.service;

import com.example.securtiynew.dto.RegisterRequest;
import com.example.securtiynew.entity.User;

public interface UserService {
    User findUserByEmail(String email);

    void register(RegisterRequest registerRequest);
}
