package com.example.spacesx.model.mapper;

import com.example.spacesx.model.dto.RequestPlayerDto;
import com.example.spacesx.model.dto.ResponsePlayerDto;
import com.example.spacesx.model.entity.Player;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PlayerMapper {
    Player toPlayerEntity(RequestPlayerDto requestPlayerDto);

    ResponsePlayerDto toResponsePlayerDto(Player player);
}
