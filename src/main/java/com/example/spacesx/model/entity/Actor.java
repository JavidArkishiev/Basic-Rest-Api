package com.example.spacesx.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "actor_generator")
    @SequenceGenerator(name = "actor_generator",
            sequenceName = "actor_sequence",
            allocationSize = 1)
    private Integer id;

    @Column(name = "name", nullable = false, length = 29)
    private String name;

    @Column(name = "surname", nullable = false, length = 22)
    private String surname;

    @Column(name = "age", nullable = false, length = 12)
    private int age;

    @Column(name = "movies", length = 30)
    private String movies;

    private LocalDateTime localDateTime = LocalDateTime.now();
}
