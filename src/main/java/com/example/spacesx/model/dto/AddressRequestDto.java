package com.example.spacesx.model.dto;

import lombok.Data;

@Data
public class AddressRequestDto {
    private String streetName;
    private String houseName;
    private String zipCode;
}
