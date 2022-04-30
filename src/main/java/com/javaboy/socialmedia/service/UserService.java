package com.javaboy.socialmedia.service;

import com.javaboy.socialmedia.entity.User;
import com.javaboy.socialmedia.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends BaseService<User, Long> {
    User findByUsername(String username);

    User findByByEmailAddress(String email);


}
