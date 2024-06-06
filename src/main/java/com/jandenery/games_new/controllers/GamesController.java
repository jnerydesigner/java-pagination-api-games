package com.jandenery.games_new.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jandenery.games_new.api.response.GamesResponse;
import com.jandenery.games_new.services.GamesService;

@RequestMapping("/games")
@RestController
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public ResponseEntity<GamesResponse> findAllGames(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "field", defaultValue = "gameName") String sortBy,
            @RequestParam(value = "sort", defaultValue = "asc") String sortDirection

    ) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(this.gamesService.findAllGames(page, pageSize, sortBy, sortDirection));
    }
}
