package com.example.spacesx.repository;

import com.example.spacesx.model.dto.ResponsePlayerDto;
import com.example.spacesx.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
