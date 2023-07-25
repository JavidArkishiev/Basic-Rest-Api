package com.example.spacesx.model.dto;

import com.example.spacesx.model.entity.Address;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ResponseEmployeeDto {
    private String gmail;
    private String firstName;
    private int age;
    private Address address;


}
