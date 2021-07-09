package ru.netologyTestsForCoverage;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieCoverageTest {

    @Test
    public void MoviesCount() {
        MovieItem movie = new MovieItem();
        movie.setMoviesCount(11);
    }
    @Test
    public void TestCoverageForGet() {
        MovieItem movie = new MovieItem();
        movie.getMovieId();
        movie.getMovieGenre();
        movie.getMovieTitle();
        movie.getMoviesCount();


    }

    @Test
    public void TestCoverageForSet() {
        MovieItem movie = new MovieItem();
        movie.setMovieId(4);
        movie.setMovieGenre("horror");
        movie.setMoviesCount(9);
        movie.setMovieTitle("the ring");
        movie.setPremiereIsTomorrow(false);
        movie.setPremiereIsTomorrow(true);

    }

    @Test
    public void PremiereIsTomorrowTrue() {
        MovieItem movie = new MovieItem(1, "theFellowShipOfTheRing", "fantasy", true, 10);
        assertEquals(true, movie.isPremiereIsTomorrow());

    }

    @Test
    public void PremiereIsTomorrowFalse() {
        MovieItem movie = new MovieItem(2, "theTwoTowers", "fantasy", false, 1);
        assertEquals(false, movie.isPremiereIsTomorrow());

    }
}