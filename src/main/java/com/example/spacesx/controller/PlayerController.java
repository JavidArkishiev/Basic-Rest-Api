package com.example.spacesx.controller;

import com.example.spacesx.model.dto.RequestPlayerDto;
import com.example.spacesx.model.dto.ResponsePlayerDto;
import com.example.spacesx.model.entity.Player;
import com.example.spacesx.serivce.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping
    public RequestPlayerDto createPlayer(@RequestBody RequestPlayerDto requestPlayerDto) {
        return playerService.createPlayer(requestPlayerDto);
    }

    @GetMapping("/{id}")
    public ResponsePlayerDto getById(@PathVariable Long id) {
        return playerService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePlayer(@PathVariable Long id) {
        return playerService.deletePlayer(id);
    }

    @PutMapping("/{id}")
    public RequestPlayerDto updatePlayer(@PathVariable Long id, @RequestBody RequestPlayerDto requestPlayerDto) {
        return playerService.updatePlayer(id, requestPlayerDto);
    }

    @GetMapping()
    public List<Player> getAllPlayer() {
        return playerService.getAllPlayer();

    }
}

