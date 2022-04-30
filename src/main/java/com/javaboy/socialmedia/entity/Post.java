package com.javaboy.socialmedia.entity;

import com.javaboy.socialmedia.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post extends BaseEntity<Long> {
    private String title;
    private String body;
    private String cover;
    @ManyToOne
    private User user;

    @ManyToMany
    private List<Category> categoryList;
}
