package ru.netology.manager;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private MovieItem first = new MovieItem(1, "theFellowShipOfTheRing", "fantasy", true, 10);
    private MovieItem second = new MovieItem(2, "theTwoTowers", "fantasy", false, 1);
    private MovieItem third = new MovieItem(3, "theReturnOfTheKing", "fantasy", false, 0);

// // @BeforeEach
//  public void setUp() {
//    manager.add(first);
//    manager.add(second);
//    manager.add(third);
//  }

    @Test
    void addInEmpty() {
        manager.add(first);

        assertArrayEquals(new MovieItem[]{first}, manager.getAll());
    }
    @Test
    void addTwoMovies() {
        manager.add(first);
        manager.add(second);

        assertArrayEquals(new MovieItem[]{second, first}, manager.getAll());
    }

    @Test
    void addThreeMovies() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        assertArrayEquals(new MovieItem[]{third, second, first}, manager.getAll());
    }

    @Test
    void getAllMovieCount1() {
       MovieManager movieManager = new MovieManager(1);

        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);

        assertArrayEquals(new MovieItem[]{third}, movieManager.getAll());
    }

    @Test
    void getAllMovieCount9() {
        MovieManager movieManager = new MovieManager(9);

        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);

        assertArrayEquals(new MovieItem[]{third, second, first}, movieManager.getAll());
    }
}


