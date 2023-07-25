package com.example.spacesx.model.mapper;

import com.example.spacesx.model.dto.RequestGamerDto;
import com.example.spacesx.model.dto.ResponseGamerDto;
import com.example.spacesx.model.entity.Gamer;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class GamerMapper {
    private final ModelMapper modelMapper;

    public Gamer toGamerEntity(RequestGamerDto requestGamerDto) {
        return modelMapper.map(requestGamerDto, Gamer.class);
    }

    public ResponseGamerDto toResponseGamerDto(Gamer gamer) {
        return modelMapper.map(gamer, ResponseGamerDto.class);
    }
}
