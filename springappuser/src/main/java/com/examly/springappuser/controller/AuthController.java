package com.examly.springappuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.examly.springappuser.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springappuser.service.UserService;

import com.examly.springappuser.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        userService.registerUser(user);
        return new ResponseEntity<>("User registered successfully",HttpStatus.CREATED);
    }
}
