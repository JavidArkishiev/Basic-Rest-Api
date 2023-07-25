package com.example.spacesx.repository;

import com.example.spacesx.model.entity.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerRepository extends JpaRepository<Gamer,Long> {
}
