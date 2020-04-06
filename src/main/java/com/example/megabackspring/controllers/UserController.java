package com.example.megabackspring.controllers;

import com.example.megabackspring.daos.UserDao;
import com.example.megabackspring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/")
    public List<User> getAllUsers() {
        List<User> users = userDao.findAll();
       return users;
    }

    @GetMapping("/{idUser}")
    public User getUserById(@PathVariable Integer idUser) {
        User user = userDao.getOne(idUser);
        return user;
    }
}