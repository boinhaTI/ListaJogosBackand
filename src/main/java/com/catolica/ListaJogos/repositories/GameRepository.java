package com.catolica.ListaJogos.repositories;

import com.catolica.ListaJogos.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
