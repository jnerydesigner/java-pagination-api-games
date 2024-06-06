package com.jandenery.games_new.model;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "games_new")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GamesModel {
    private static final long serialVersionUID = 1L;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "system_full")
    private String systemFull;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "developer")
    private String developer;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "image_url")
    private String imageUrl;

}
