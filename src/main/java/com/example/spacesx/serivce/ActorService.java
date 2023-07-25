package com.example.spacesx.serivce;

import com.example.spacesx.model.dto.RequestActorDto;
import com.example.spacesx.model.dto.ResponseActorDto;
import com.example.spacesx.model.entity.Actor;
import com.example.spacesx.model.mapper.ActorMapper;
import com.example.spacesx.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {
    private final ActorRepository actorRepository;
    private final ActorMapper actorMapper;

    public RequestActorDto createActor(RequestActorDto requestActorDto) {
        Actor actor = actorMapper.toActorEntity(requestActorDto);
        actorRepository.save(actor);
        return requestActorDto;
    }

    public ResponseActorDto getById(Integer id) {
        Actor actor = actorRepository.findById(id).orElse(null);
        ResponseActorDto responseActorDto = actorMapper.toResponseActorDto(actor);
        return responseActorDto;
    }

    public String deleteActor(Integer id) {
        actorRepository.deleteById(id);
        return "This Actor has deleted :)";
    }

    public List<Actor> getAllActor() {
        return actorRepository.findAll();
    }

    public RequestActorDto updateActor(Integer id, RequestActorDto requestActorDto) {
          Actor actor= actorRepository.findById(id).orElse(null);
          if (actor!=null){
            Actor updateActor= actorMapper.toActorEntity(requestActorDto);
            updateActor.setId(actor.getId());
            actorRepository.save(updateActor);
            return requestActorDto;

          }
        return null;
    }
}
