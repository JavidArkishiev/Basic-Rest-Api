package com.example.spacesx.repository;

import com.example.spacesx.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
}
