package com.example.spacesx.model.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,
            generator = "employee_generator")
    @SequenceGenerator(name = "employee_generator",
            sequenceName = "employee_sequence",
            allocationSize = 1)

    private Integer id;

    @Column(nullable = false, unique = true)
    private String identifier;

    @Column(name = "firstname",nullable = false)
    private String firstName;

    @Column(name = "surname",nullable = false)
    private String surname;

    @Column(name = "gmail" ,nullable = false,unique = true,length = 12345)
    private String gmail;

    @Column(name = "birthday",nullable = false)
    private String birthday;

    @Column(nullable = false,length = 1234)
    private Integer age;

    private LocalDateTime createAt=LocalDateTime.now();


////    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private EmployeeRole role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private Address address;
}
