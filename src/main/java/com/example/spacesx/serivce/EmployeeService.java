package com.example.spacesx.serivce;

import com.example.spacesx.model.dto.RequestEmployeeDto;
import com.example.spacesx.model.dto.ResponseEmployeeDto;
import com.example.spacesx.model.entity.Address;
import com.example.spacesx.model.entity.Employee;
import com.example.spacesx.model.mapper.EmployeeMapper;
import com.example.spacesx.repository.AddressRepository;
import com.example.spacesx.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.FileNameMap;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final AddressRepository addressRepository;

    public RequestEmployeeDto create(RequestEmployeeDto requestEmployeeDto) {

        Employee employee = employeeMapper.toEmployeeEntity(requestEmployeeDto);
        Address address = new Address();
        address.setStreetName(requestEmployeeDto.getAddress().getStreetName());
        address.setHouseName(requestEmployeeDto.getAddress().getHouseName());
        address.setZipCode(requestEmployeeDto.getAddress().getZipCode());
        employee.setAddress(address);
        address.setEmployee(employee);

        employeeRepository.save(employee);
        addressRepository.save(address);
        return requestEmployeeDto;
    }

    public ResponseEmployeeDto getById(Integer id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        ResponseEmployeeDto responseEmployeeDto = employeeMapper.toResponseEmployeeDto(employee);
        return responseEmployeeDto;


    }
}
