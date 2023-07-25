package com.example.spacesx.serivce;

import com.example.spacesx.exception.PlayerNotFound;
import com.example.spacesx.model.dto.RequestPlayerDto;
import com.example.spacesx.model.dto.ResponsePlayerDto;
import com.example.spacesx.model.entity.Player;
import com.example.spacesx.model.mapper.PlayerMapper;
import com.example.spacesx.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public RequestPlayerDto createPlayer(RequestPlayerDto requestPlayerDto) {
        Player newPlayer = playerMapper.toPlayerEntity(requestPlayerDto);
        playerRepository.save(newPlayer);
        return requestPlayerDto;
    }

    public ResponsePlayerDto getById(Long id) {
        Player player = playerRepository.findById(id).orElseThrow(() -> new PlayerNotFound("Player not found"));
        return playerMapper.toResponsePlayerDto(player);
    }

    public String deletePlayer(Long id) {
        playerRepository.deleteById(id);
        return "This player has deleted :)";
    }

    public RequestPlayerDto updatePlayer(Long id, RequestPlayerDto requestPlayerDto) {
        Player oldPlayer = playerRepository.findById(id).orElse(null);
        if (oldPlayer != null) {
            Player updatePlayer = playerMapper.toPlayerEntity(requestPlayerDto);
            updatePlayer.setId(oldPlayer.getId());
            playerRepository.save(updatePlayer);
            return requestPlayerDto;
        }
        return null;
    }

    public List<Player> getAllPlayer() {
        return playerRepository.findAll();
    }


}
