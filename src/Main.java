import classes.Cast;
import classes.Director;
import classes.Movie;
import service.impl.ServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Barry ", "Jenkins");
        Director director2 = new Director("Martin ", "Scorsese");
        Director director3 = new Director("Terry ", "Gilliam ");
        Director director4 = new Director("Raoul  ", "Peck");
        Director director5 = new Director("Stanley  ", "Kubrick");


        Movie movie1 = new Movie("If Beale Street Could Talk", 2018, "Drama",
                director1,new ArrayList<>(List.of(new Cast("Stephan James", "Fonny"),new Cast("Jonny Dep","Iron Man"))) );
        Movie movie2 = new Movie("Monty Python and the Holy Grail", 1975, "Comedy",
                director2, new ArrayList<>(List.of(new Cast("  Peggy Sheeran ", "Lucy Gallina"),new Cast("Anjelina JOlly","Thron"))));
        Movie movie3 = new Movie("The Irishman", 2019, "Crime, Drama",
                director3,new ArrayList<>(List.of(new Cast("Malcolm McDowell", "Holy Grail"),new Cast("  Peggy Sheeran ", "Lucy Gallina"))) );
        Movie movie4 = new Movie(" I Am Not Your Negro", 2017, "Documentary",
                director4,new ArrayList<>(List.of( new Cast("Raoul Peck", "James Baldwin"))));
        Movie movie5 = new Movie("A Clockwork Orange", 1971, "Thriller",
                director5, new ArrayList<>(List.of(new Cast("Malcolm McDowell", "British Minister"),new Cast("Robert Donvey","Hulk"))));
        List<Movie> movies = new LinkedList<>(Arrays.asList(movie1, movie2, movie3, movie4, movie5));
        ServiceImpl interfaceImpl = new ServiceImpl();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        while (true) {

            switch (scanner1.nextByte()) {
                case 1 -> {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~All Movies~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print(interfaceImpl.getAllMovies(movies));
                    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Enjoy watching movies~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                case 2 -> {
                    System.out.println("Please enter name of film: ");
                    interfaceImpl.findMovieByName(movies);
                }
                case 3 -> {System.out.println("Please enter the actor name: ");
                    interfaceImpl.findMovieByActorName(movies);
                }

                case 5 -> {
                    System.out.println("Please enter the name of director: ");
                    interfaceImpl.findMovieByDirector(movies);
                }
                case 6 -> { System.out.println("Please enter the description: ");
                    interfaceImpl.findMovieByDescription(movies);

                }
                case 7 -> {
                    System.out.println("Please enter the role of actor: ");
                    String name = scanner.nextLine();
                    interfaceImpl.findMovieByRole(movies);
                }
                case 8 ->  interfaceImpl.sortByMovieName(movies);
                case 9 -> interfaceImpl.sortByYear(movies);
                case 10 -> interfaceImpl.sortByDirector(movies);

            }
        }
    }

    static {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Choose your selections:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("""
                1.All movies
                2.Find by movie name.
                3.Find by actor name.
                4.Find by year.
                5.Find by director.
                6.Find by description.
                7.Find by role.
                8.Sort by movie name.
                9.Sort by year
                10.Sort by director.
                """);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Have nice watching~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please input the number:  ");
    }

}



