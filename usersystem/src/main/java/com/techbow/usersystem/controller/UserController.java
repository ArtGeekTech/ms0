package com.techbow.usersystem.controller;

import com.techbow.usersystem.domain.User;
import com.techbow.usersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    // depends on UserService
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String HelloWorld() {
        return "Hello Annie";
    }


    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    @ResponseBody
    public User createUser(@RequestBody User input) {
        return userService.save(input);
    }
}

