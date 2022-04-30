package com.javaboy.socialmedia.service.impl;

import com.javaboy.socialmedia.entity.User;
import com.javaboy.socialmedia.repository.UserRepository;
import com.javaboy.socialmedia.service.UserService;
import com.javaboy.socialmedia.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository baseRepository, UserRepository userRepository) {
        super(baseRepository);
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;

    public User registerUser(User user) {
        return this.userRepository.save(user);
    }



    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByByEmailAddress(String email) {
        return userRepository.findByEmail(email);
    }
}
