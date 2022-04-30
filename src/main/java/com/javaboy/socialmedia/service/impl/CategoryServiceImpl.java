package com.javaboy.socialmedia.service.impl;

import com.javaboy.socialmedia.entity.Category;
import com.javaboy.socialmedia.repository.CategoryRepository;
import com.javaboy.socialmedia.service.CategoryService;
import com.javaboy.socialmedia.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long, CategoryRepository> implements CategoryService {
    public CategoryServiceImpl(CategoryRepository baseRepository) {
        super(baseRepository);
    }
}
