package com.example.securtiynew.controller;

import com.example.securtiynew.dto.RegisterRequest;
import com.example.securtiynew.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    //    @GetMapping("/welcome")
//    public String welcome() {
//        return "Welcome to site";
//    }
//
//    @GetMapping("/user")
//    @PreAuthorize("hasRole('USER')")
//    public String user() {
//        return "welcome to user site";
//
//    }
//
//    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ADMIN')")
//    public String admin() {
//        return "welcome to admin site";
//    }
    @PostMapping("/register")
    public void register(@RequestBody @Valid RegisterRequest registerRequest) {
        userService.register(registerRequest);
    }
}
