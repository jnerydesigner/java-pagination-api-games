package com.jandenery.games_new.api.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jandenery.games_new.model.GamesModel;

public class GamesResponse {
    @JsonProperty("totalGames")
    private Number totalGames;

    @JsonProperty("totalPages")
    private Number totalPages;

    @JsonProperty("currentPage")
    private Number currentPage;

    @JsonProperty("games")
    private List<GamesModel> games;

    // Getters and Setters
    public Number getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Number totalGames) {
        this.totalGames = totalGames;
    }

    public Number getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Number totalPages) {
        this.totalPages = totalPages;
    }

    public Number getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Number currentPage) {
        this.currentPage = currentPage;
    }

    public List<GamesModel> getGames() {
        return games;
    }

    public void setGames(List<GamesModel> games) {
        this.games = games;
    }
}
