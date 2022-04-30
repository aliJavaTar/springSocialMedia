package com.javaboy.socialmedia.controller;

import com.javaboy.socialmedia.entity.User;
import com.javaboy.socialmedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {
    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public List<User> getAllUsers()
    {
       return this.userService.findAll();
    }

   @RequestMapping(value = "/",method = {RequestMethod.POST})
    public User registerUser(@RequestBody User user)
   {
       return this.userService.create(user);
   }
}
