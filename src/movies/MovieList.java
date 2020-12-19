package movies;

import java.util.*;

public class MovieList {

    //This method was designed only to hold movies in an ArrayList and return it as a list sorted in Alphabetical order
    public List<String> MovieList() {

        List<String> movies = new ArrayList<>();
        movies.add("Robot Chicken");
        movies.add("Family Guy");
        movies.add("American Dad");
        movies.add("Bob's Burgers");
        movies.add("The Simpsons");

        movies.add("John Q");
        movies.add("The Green Mile");
        movies.add("The Breakfast Club");
        movies.add("The Shawshank Redemption");
        movies.add("Braveheart");

        movies.add("Scream");
        movies.add("Carrie");
        movies.add("Insideous");
        movies.add("Insideous 2");
        movies.add("Sinister");

        movies.add("The Book of Eli");
        movies.add("Daybreakers");
        movies.add("Hunter Prey");
        movies.add("Predators");
        movies.add("Skyline");

        //Sorts the array in alphabetical order
        Collections.sort(movies);

        return movies;
    }

}