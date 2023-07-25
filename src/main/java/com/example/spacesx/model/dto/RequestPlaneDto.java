package com.example.spacesx.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RequestPlaneDto {

    private int number;
    private String marca;
    private Integer price;
    private String manufacture_place;
}
