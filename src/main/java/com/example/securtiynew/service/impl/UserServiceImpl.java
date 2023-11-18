package com.example.securtiynew.service.impl;

import com.example.securtiynew.config.PasswordConfig;
import com.example.securtiynew.dto.RegisterRequest;
import com.example.securtiynew.entity.User;
import com.example.securtiynew.exception.UserNotFoundException;
import com.example.securtiynew.mapper.UserMapper;
import com.example.securtiynew.repository.UserRepository;
import com.example.securtiynew.security.MyUserDetailsService;
import com.example.securtiynew.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.event.CaretListener;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordConfig passwordConfig;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email).orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    @Override
    public void register(RegisterRequest registerRequest) {
        User userEntity = userMapper.toUserFromRegisterRequest(registerRequest);
        userEntity.setPassword(passwordConfig.passwordEncoder().encode(registerRequest.password()));
        userRepository.save(userEntity);


    }
}
