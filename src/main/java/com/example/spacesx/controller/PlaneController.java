package com.example.spacesx.controller;

import com.example.spacesx.model.dto.RequestPlaneDto;
import com.example.spacesx.model.dto.ResponsePlaneDto;
import com.example.spacesx.model.entity.Plane;
import com.example.spacesx.serivce.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plane")
public class PlaneController {
    private final PlaneService planeService;


    @PostMapping
    public RequestPlaneDto createPlane(@RequestBody RequestPlaneDto requestPlaneDto) {
        return planeService.createPlane(requestPlaneDto);
    }

    @GetMapping("/{id}")
    public ResponsePlaneDto getById(@PathVariable Long id) {
        return planeService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePlane(@PathVariable Long id) {
        return planeService.deletePlane(id);
    }

    @PutMapping("/{id}")
    public RequestPlaneDto updatePlnae(@PathVariable Long id, @RequestBody RequestPlaneDto requestPlaneDto) {
        return planeService.updatePlane(id, requestPlaneDto);
    }

    @GetMapping
    public List<Plane> getAllPlane() {
        return planeService.getAllPlane();
    }

}
