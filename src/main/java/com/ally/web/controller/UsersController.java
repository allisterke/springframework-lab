package com.ally.web.controller;

import com.ally.web.mapper.UserMapper;
import com.ally.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ally on 7/5/17.
 */
@RestController
public class UsersController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/users")
    List<User> getAllUsers() {
        List<User> users = userMapper.getAllUsers();
        return users;
    }

    @RequestMapping("/user")
    User getUser() {
        User user = userMapper.getUser();
        return user;
    }
}
