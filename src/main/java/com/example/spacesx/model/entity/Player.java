package com.example.spacesx.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "player")

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "player_generator")
    @SequenceGenerator(name = "player_generator",
            sequenceName = "player_sequence",
            allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false, length = 55)
    private String name;

    @Column(name = "surname", nullable = false, length = 23)
    private String surname;

    @Column(name = "age", nullable = false, length = 99)
    private int age;

    @Column(name = "player_number", nullable = false, length = 123)
    private String player_number;

    @Column(name = "local_date_time", nullable = false)
    private LocalDateTime localDateTime = LocalDateTime.now();
}
