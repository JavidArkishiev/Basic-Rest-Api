package com.example.spacesx.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,
            generator = "address_generator")
    @SequenceGenerator(name = "address_generator",
            sequenceName = "address_sequence",
            allocationSize = 1)
    private Integer id;
    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    private String houseName;

    @Column(nullable = false)
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;

}
