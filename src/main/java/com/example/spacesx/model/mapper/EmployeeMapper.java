package com.example.spacesx.model.mapper;

import com.example.spacesx.model.dto.RequestEmployeeDto;
import com.example.spacesx.model.dto.ResponseEmployeeDto;
import com.example.spacesx.model.entity.Employee;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEmployeeEntity(RequestEmployeeDto requestEmployeeDto);

    ResponseEmployeeDto toResponseEmployeeDto(Employee employee);
}
