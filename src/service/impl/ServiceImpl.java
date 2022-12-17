package service.impl;

import classes.Movie;
import service.Findable;
import service.Sortable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Findable, Sortable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        List<Movie> moviesStream=movies.stream().toList();
        return moviesStream;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        String nameOfMovie=new Scanner(System.in).nextLine();
        List<Movie>streamFindingByName=movies.stream()
                .filter(movie -> movie.getName().matches(nameOfMovie)).toList();
        streamFindingByName.forEach(System.out::println);

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        int i=0;
        String actorName=new Scanner(System.in).nextLine();
        List<Movie>streamActorName=movies.stream()
                .filter(movie -> movie.getCast().get(i).getActorFullName().matches(actorName)).toList();
        streamActorName.forEach(System.out::println);

    }


    @Override
    public void findMovieByDirector(List<Movie> movies) {
        String directorName=new Scanner(System.in).nextLine();
        List<Movie>streamDirector=movies.stream()
                .filter(movie -> movie.getDirector().getName().matches(directorName)).toList();
        streamDirector.forEach(System.out::println);

    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        String description=new Scanner(System.in).nextLine();
        List<Movie>streamDescription=movies.stream().
                filter(movie -> movie.getDirector().equals(description)).toList();
        streamDescription.forEach(System.out::println);

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        int i=0;
        String role=new Scanner(System.in).nextLine();
        List<Movie>streamRole=movies.stream()
                .filter(movie -> movie.getCast().get(i).getRole().matches(role)).toList();
        streamRole.forEach(System.out::println);

    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        List<Movie>moviesSortByName=movies.stream()
                .sorted(Comparator.comparing(Movie::getName)).toList();
        moviesSortByName.forEach(System.out::println);

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        List<Movie> moviesSortByYear=movies.stream()
                .sorted(Comparator.comparing(Movie::getYear)).toList();
        moviesSortByYear.forEach(System.out::println);

    }

    @Override
    public void sortByDirector(List<Movie> movies) {

     List<Movie>moviesSortByDirector=movies.stream().
             sorted(Comparator.comparing(movie -> movie.getDirector().getName())).toList();
     moviesSortByDirector.forEach(System.out::println);
    }
}
