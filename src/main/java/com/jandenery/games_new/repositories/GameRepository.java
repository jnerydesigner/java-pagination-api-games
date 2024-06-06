package com.jandenery.games_new.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;

import com.jandenery.games_new.model.GamesModel;

public interface GameRepository extends JpaRepository<GamesModel, UUID> {
    @Query("SELECT g FROM GamesModel g")
    List<GamesModel> findAllGames(Pageable pageable);
}
