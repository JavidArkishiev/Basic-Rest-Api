package com.example.spacesx.controller;

import com.example.spacesx.model.dto.RequestActorDto;
import com.example.spacesx.model.dto.ResponseActorDto;
import com.example.spacesx.model.entity.Actor;
import com.example.spacesx.serivce.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/actor")
public class ActorController {
    private final ActorService actorService;

    @PostMapping
    public RequestActorDto createActor(@RequestBody RequestActorDto requestActorDto) {
        return actorService.createActor(requestActorDto);
    }

    @GetMapping("/{id}")
    public ResponseActorDto getById(@PathVariable Integer id) {
        return actorService.getById(id);

    }

    @DeleteMapping("/{id}")
    public String deleteActor(@PathVariable Integer id) {
        return actorService.deleteActor(id);
    }

    @GetMapping
    public List<Actor> getAllActor() {
        return actorService.getAllActor();
    }

    @PutMapping("/{id}")
    public RequestActorDto updateActor(@PathVariable Integer id, @RequestBody RequestActorDto requestActorDto) {
        return actorService.updateActor(id, requestActorDto);
    }
}
