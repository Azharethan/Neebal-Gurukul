package functionalProgramming_Assigment;

//Assignment 1
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Question_1 {
	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie("Spotlight", 2015, "Hollywood"),
				new Movie("Avengers: Infinity War", 2018, "Hollywood"), new Movie("Inception", 2010, "Hollywood"),
				new Movie("Forest Gump", 1994, "Hollywood"), new Movie("3 Idiots", 2009, "Bollywood"),
				new Movie("Beauty and the beast", 2017, "Hollywood"),
				new Movie("Slumdog Millionaire", 2008, "Bollywood")

		);

		System.out.println("======================================================\n"
				+ "1.Mapping : print only the names of all the movies\n"
				+ "======================================================");
		Stream<Movie> streamMovieName = movies.stream();
		streamMovieName.map(Movie::getName).forEach(System.out::println);
		
		

		System.out.println("======================================================\n"
				+ "2.Traversal : print all the movies objects\n"
				+ "======================================================");
		Stream<Movie> streamMovieObject = movies.stream();
		streamMovieObject.forEach(e -> System.out.println(e));
		

		System.out.println("======================================================\n"
				+ "3.Sort and print in increasing order of release date of movies using sort function directly on movies object\n"
				+ "======================================================");

		Stream<Movie> releaseDate = movies.stream();
		movies.sort((e1, e2) -> Integer.compare(e1.getReleaseYear(), e2.getReleaseYear()));
		movies.forEach(e -> System.out.println(e));
		
		

		System.out.println("======================================================\n"
				+ "4.Print a string containing all the movie names , use reduce terminal operation to achieve the same\n"
				+ "======================================================");
		System.out.println();
		Stream<Movie> streamMovieName1 = movies.stream();
		String movieName = streamMovieName1.map(Movie::getName).reduce("",
				(result, name) -> result.isEmpty() ? name : result + "\n" + name);
		System.out.println(movieName);
	}
}
