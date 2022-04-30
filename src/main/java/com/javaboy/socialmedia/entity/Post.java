package com.javaboy.socialmedia.entity;

import com.javaboy.socialmedia.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Post extends BaseEntity<Long> {
    private String title;
    private String body;
    private String cover;

}