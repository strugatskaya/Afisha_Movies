package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class MovieItem {

    private int movieId;
    private String movieTitle;
    private String movieGenre;
    private boolean premiereIsTomorrow;
    private int moviesCount;
}