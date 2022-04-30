package com.javaboy.socialmedia.entity.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class BaseEntity<ID extends Serializable> {
    private static final String UPDATE_AT = "updated_at";
    private static final String CREATED_AT = "created_at";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
    @Column(name = UPDATE_AT)
    private LocalDateTime updatedAt;
    @Column(name = CREATED_AT)
    private LocalDateTime createdAt;

    public BaseEntity() {
    }


}
