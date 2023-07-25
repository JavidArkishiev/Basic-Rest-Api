package com.example.spacesx.model.mapper;

import com.example.spacesx.model.dto.RequestPlaneDto;
import com.example.spacesx.model.dto.ResponsePlaneDto;
import com.example.spacesx.model.entity.Plane;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PlaneMapper {
    Plane toPlaneEntity(RequestPlaneDto requestPlaneDto);

    ResponsePlaneDto toResponsePlaneDto(Plane plane);
}
