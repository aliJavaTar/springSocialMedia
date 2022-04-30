package com.javaboy.socialmedia.repository;

import com.javaboy.socialmedia.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
