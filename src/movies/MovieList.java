package movies;

import java.util.*;

public class MovieList {

	public String movieList() {

		List<String> animated = new ArrayList<>();
		animated.add("Robot Chicken");
		animated.add("Family Guy");
		animated.add("American Dad");
		animated.add("Bob's Burgers");
		animated.add("The Simpsons");

		List<String> drama = new ArrayList<>();
		drama.add("John Q");
		drama.add("The Green Mile");
		drama.add("The Breakfast Club");
		drama.add("The Shawshank Redemption");
		drama.add("Braveheart");

		List<String> horror = new ArrayList<>();
		horror.add("Scream");
		horror.add("Carrie");
		horror.add("Insideous");
		horror.add("Insideous 2");
		horror.add("Sinister");

		List<String> scifi = new ArrayList<>();
		scifi.add("The Book of Eli");
		scifi.add("Daybreakers");
		scifi.add("Hunter Prey");
		scifi.add("Predators");
		scifi.add("Skyline");

		return null;
	}

}