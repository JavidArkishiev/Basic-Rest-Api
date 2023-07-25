package com.example.spacesx.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "gamer")
public class Gamer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "gamer_generator")
    @SequenceGenerator(name = "gamer_generator",
            sequenceName = "gamer_sequence",
            allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false, length = 22)
    private String name;

    @Column(name = "surname", nullable = false, length = 34)
    private String surname;

    @Column(name = "age", nullable = false, length = 33)
    private int age;

    @Column(name = "gamer_number", nullable = false, length = 44)
    private String gamer_number;

    private LocalDateTime localDateTime = LocalDateTime.now();


}
