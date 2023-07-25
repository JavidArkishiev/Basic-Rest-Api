package com.example.spacesx.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RequestEmployeeDto {

    private String firstName;
    private String surname;
    private String identifier;
    private int age;
    private String gmail;
    private String birthday;
    private AddressRequestDto address;

}
