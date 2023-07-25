package com.example.spacesx.repository;

import com.example.spacesx.model.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane,Long> {
}
