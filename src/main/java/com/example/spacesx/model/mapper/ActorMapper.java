package com.example.spacesx.model.mapper;

import com.example.spacesx.model.dto.RequestActorDto;
import com.example.spacesx.model.dto.ResponseActorDto;
import com.example.spacesx.model.entity.Actor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ActorMapper {
    Actor  toActorEntity(RequestActorDto requestActorDto);

    ResponseActorDto toResponseActorDto(Actor actor);
}
