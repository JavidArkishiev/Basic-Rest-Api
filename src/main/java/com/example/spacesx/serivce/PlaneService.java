package com.example.spacesx.serivce;

import com.example.spacesx.model.dto.RequestPlaneDto;
import com.example.spacesx.model.dto.ResponsePlaneDto;
import com.example.spacesx.model.entity.Plane;
import com.example.spacesx.model.mapper.PlaneMapper;
import com.example.spacesx.repository.PlaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaneService {
    private final PlaneRepository planeRepository;
    private final PlaneMapper planeMapper;
    public RequestPlaneDto createPlane(RequestPlaneDto requestPlaneDto) {
           Plane plane=planeMapper.toPlaneEntity(requestPlaneDto);
           planeRepository.save(plane);
           return requestPlaneDto;

    }

    public ResponsePlaneDto getById(Long id) {
       Plane plane=planeRepository.findById(id).orElse(null);
        ResponsePlaneDto responsePlaneDto= planeMapper.toResponsePlaneDto(plane);
        return responsePlaneDto;
    }

    public String deletePlane(Long id) {
        planeRepository.deleteById(id);
        return "That plane has deleted";
    }

    public RequestPlaneDto updatePlane(Long id, RequestPlaneDto requestPlaneDto) {
        Optional<Plane> plane = planeRepository.findById(id);
        if (plane.isPresent()) {
            Plane updatePlane = planeMapper.toPlaneEntity(requestPlaneDto);
            updatePlane.setId(plane.get().getId());
            planeRepository.save(updatePlane);
            return requestPlaneDto;
        }
        return null;
    }
    public List<Plane> getAllPlane() {
        return planeRepository.findAll();
    }
}
