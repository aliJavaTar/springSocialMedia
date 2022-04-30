package com.javaboy.socialmedia.service.impl;

import com.javaboy.socialmedia.entity.Post;
import com.javaboy.socialmedia.repository.PostRepository;
import com.javaboy.socialmedia.service.PostService;
import com.javaboy.socialmedia.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl extends BaseServiceImpl<Post, Long, PostRepository> implements PostService {
    public PostServiceImpl(PostRepository baseRepository) {
        super(baseRepository);
    }
}
