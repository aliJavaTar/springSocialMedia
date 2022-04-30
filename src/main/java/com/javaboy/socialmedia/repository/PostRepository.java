package com.javaboy.socialmedia.repository;

import com.javaboy.socialmedia.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
