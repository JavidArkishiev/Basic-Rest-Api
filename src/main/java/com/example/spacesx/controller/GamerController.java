package com.example.spacesx.controller;

import com.example.spacesx.model.dto.RequestActorDto;
import com.example.spacesx.model.dto.RequestGamerDto;
import com.example.spacesx.model.dto.ResponseGamerDto;
import com.example.spacesx.serivce.GamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gamer")
public class GamerController {
    private final GamerService gamerService;

    @PostMapping
    public RequestGamerDto createGamer(@RequestBody RequestGamerDto requestGamerDto) {
        return gamerService.createGamer(requestGamerDto);
    }

    @GetMapping("/{id}")
    public ResponseGamerDto getById(@PathVariable Long id) {
        return gamerService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteGamer(@PathVariable Long id) {
        return gamerService.deleteGamer(id);
    }

    @PutMapping("/{id}")
    public RequestGamerDto updateGamer(@PathVariable Long id, @RequestBody RequestGamerDto requestGamerDto) {
        return gamerService.updateGamer(id, requestGamerDto);
    }


}
