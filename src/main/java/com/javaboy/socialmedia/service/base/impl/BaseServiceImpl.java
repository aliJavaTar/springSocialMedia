package com.javaboy.socialmedia.service.base.impl;

import com.javaboy.socialmedia.entity.base.BaseEntity;
import com.javaboy.socialmedia.service.base.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<E extends BaseEntity<ID>, ID extends Serializable, R extends JpaRepository<E, ID>>
        implements BaseService<E, ID> {
    private final R baseRepository;

    public BaseServiceImpl(R baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public E create(E e) {
        return baseRepository.save(e);
    }

    @Override
    public E update(E e) {
        return baseRepository.save(e);
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public E findById(ID id) {
        return baseRepository.findById(id).orElse(null);
    }

    @Override
    public List<E> findAll() {
        return baseRepository.findAll();
    }
}
