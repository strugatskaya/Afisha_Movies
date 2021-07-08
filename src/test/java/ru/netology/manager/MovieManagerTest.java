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
    public void AddNewMovie() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }


    @Test
    public void GetAllMovies() {
        manager.getAll();
    }

}


