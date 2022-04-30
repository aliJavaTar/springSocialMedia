package com.javaboy.socialmedia.service;

import com.javaboy.socialmedia.entity.Post;
import com.javaboy.socialmedia.service.base.BaseService;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public interface PostService extends BaseService<Post,Long> {
}
