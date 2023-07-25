package com.example.spacesx.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "plane")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "plane_generator")
    @SequenceGenerator(name = "plane_generator",
            sequenceName = "plane_sequence",
            allocationSize = 1)
    private Long id;

    @Column(name = "number", nullable = false, length = 1234567876)
    private int number;

    @Column(name = "marca", nullable = false, length = 890000)
    private String marca;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "manufacture_place", nullable = false, length = 122)
    private String manufacture_place;

    @Column(name = "createAt", nullable = false)
    private LocalDateTime createAt = LocalDateTime.now();

}
