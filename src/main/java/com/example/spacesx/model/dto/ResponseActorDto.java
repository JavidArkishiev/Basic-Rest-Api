package com.example.spacesx.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ResponseActorDto {
    private String name;
    private String surname;
    private int age;
    private String movies;
}
