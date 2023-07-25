package com.example.spacesx.serivce;

import com.example.spacesx.model.dto.RequestActorDto;
import com.example.spacesx.model.dto.RequestGamerDto;
import com.example.spacesx.model.dto.ResponseGamerDto;
import com.example.spacesx.model.entity.Gamer;
import com.example.spacesx.model.mapper.GamerMapper;
import com.example.spacesx.repository.GamerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GamerService {
    private final GamerRepository gamerRepository;
    private final GamerMapper gamerMapper;

    public RequestGamerDto createGamer(RequestGamerDto requestGamerDto) {
       Gamer gamer= gamerMapper.toGamerEntity(requestGamerDto);
        gamerRepository.save(gamer);
        return requestGamerDto;
    }

    public ResponseGamerDto getById(Long id) {
        Gamer gamer=gamerRepository.findById(id).orElse(null);
      ResponseGamerDto responseGamerDto=gamerMapper.toResponseGamerDto(gamer);
      return responseGamerDto;
    }

    public String deleteGamer(Long id) {
        gamerRepository.deleteById(id);
        return "That Gamer has deleted";
    }

    public RequestGamerDto updateGamer(Long id, RequestGamerDto requestGamerDto) {
        Optional<Gamer> gamer= Optional.ofNullable(gamerRepository.findById(id).orElse(null));
            Gamer updateGamer=gamerMapper.toGamerEntity(requestGamerDto);
            updateGamer.setId(gamer.get().getId());
            gamerRepository.save(updateGamer);
            return requestGamerDto;
        }

    }
