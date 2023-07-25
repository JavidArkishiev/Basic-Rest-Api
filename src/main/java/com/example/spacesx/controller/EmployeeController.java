package com.example.spacesx.controller;

import com.example.spacesx.model.dto.RequestEmployeeDto;
import com.example.spacesx.model.dto.ResponseEmployeeDto;
import com.example.spacesx.model.entity.Employee;
import com.example.spacesx.serivce.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping()
    public RequestEmployeeDto create(@RequestBody RequestEmployeeDto requestEmployeeDto) {
        return employeeService.create(requestEmployeeDto);
    }
    @GetMapping("/{id}")
    public ResponseEmployeeDto getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }


}
