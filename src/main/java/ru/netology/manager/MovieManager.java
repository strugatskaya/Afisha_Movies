package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] movies = new MovieItem[0];
    private int moviesCount = 10;

    MovieManager() {
    }

    MovieManager(int moviesCount) {
        this.moviesCount = moviesCount;
    }

    public void add(MovieItem movie) {
        // создаём новый массив размером на единицу больше
//        int length = movies.length + 1;
        MovieItem[] tmp = new MovieItem[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieItem[] getAll() {
        int resultLength;
        if (movies.length < moviesCount) {
            resultLength = movies.length;
        } else {
            resultLength = moviesCount;
        }
        MovieItem[] result = new MovieItem[resultLength];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

}
