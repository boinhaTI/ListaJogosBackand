package com.catolica.ListaJogos.services;

import com.catolica.ListaJogos.dto.GameMinDTO;
import com.catolica.ListaJogos.entities.Game;
import com.catolica.ListaJogos.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
