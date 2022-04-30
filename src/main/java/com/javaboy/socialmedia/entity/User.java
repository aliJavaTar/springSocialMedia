package com.javaboy.socialmedia.entity;

import com.javaboy.socialmedia.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends BaseEntity<Long> {

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    @Column(nullable = false, unique = true)
    private String email;

    private String cover;

}
