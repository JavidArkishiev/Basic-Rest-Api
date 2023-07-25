package com.example.spacesx.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RequestPlayerDto {
    private String name;
    private String surname;
    private String player_number;
    private int age;

}
