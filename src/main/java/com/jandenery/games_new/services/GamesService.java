package com.jandenery.games_new.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jandenery.games_new.api.response.GamesResponse;
import com.jandenery.games_new.model.GamesModel;
import com.jandenery.games_new.repositories.GameRepository;

@Service
public class GamesService {
    @Autowired
    private GameRepository gameRepository;

    public GamesResponse findAllGames(Number page, Number pageSize, String sortBy, String sortDirection) {

        Sort.Direction direction = Sort.Direction.fromString(sortDirection);
        Sort sort = Sort.by(direction, sortBy);
        Pageable pageable = PageRequest.of(page.intValue(), pageSize.intValue(), sort);
        List<GamesModel> listGames = gameRepository.findAllGames(pageable);

        Number totalGames = this.gamesCount();

        GamesResponse response = new GamesResponse();
        response.setTotalGames(totalGames);
        response.setTotalPages((int) Math.ceil(totalGames.doubleValue() / pageSize.doubleValue()) - 1);
        response.setCurrentPage(page);
        response.setGames(listGames.stream().toList());

        return response;
    }

    public Number gamesCount() {
        return gameRepository.count();
    }

}
