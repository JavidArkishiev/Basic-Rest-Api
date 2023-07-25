package com.example.spacesx.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ResponseGamerDto {
    private String name;
    private String surname;
    private String gamer_number;

}
