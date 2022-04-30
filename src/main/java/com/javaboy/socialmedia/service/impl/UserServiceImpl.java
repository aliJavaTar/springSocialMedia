package com.javaboy.socialmedia.service.impl;

import com.javaboy.socialmedia.entity.User;
import com.javaboy.socialmedia.repository.UserRepository;
import com.javaboy.socialmedia.service.UserService;
import com.javaboy.socialmedia.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository baseRepository, UserRepository userRepository) {
        super(baseRepository);
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByByEmailAddress(String email) {
        return userRepository.findByEmail(email);
    }
}
