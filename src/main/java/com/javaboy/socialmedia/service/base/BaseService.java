package com.javaboy.socialmedia.service.base;

import com.javaboy.socialmedia.entity.base.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity<ID>, ID extends Serializable> {
    E create(E e);

    E update(E e);

    void deleteById(ID id);

    E findById(ID id);

    List<E> findAll();
}
