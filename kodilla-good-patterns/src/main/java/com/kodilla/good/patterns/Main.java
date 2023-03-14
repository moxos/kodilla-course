package com.kodilla.good.patterns;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(result);
    }
}