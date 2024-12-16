import java.util.ArrayList;
import java.util.Scanner;

public class MovieTester {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // step 1: Ask for the number of movies and create ArrayList
        System.out.println("How many movies are in your collection?");
        int numMovies = stdin.nextInt();
        ArrayList<Movie> myCollection = new ArrayList<Movie>(numMovies);

        // step 2: Collect data for each movie
        for (int i = 0; i < numMovies; i++) {
            System.out.println("Enter movie name: ");
            String name = stdin.next();
            System.out.println("Enter movie rating (Ex. PG-13): ");
            String rating = stdin.next();
            System.out.println("Enter release year: ");
            int year = stdin.nextInt();
            System.out.println("Enter runtime in minutes: ");
            double runtime = stdin.nextDouble();
            System.out.println("Enter number of stars (1-5): ");
            int stars = stdin.nextInt();

            // create movie object and add to ArrayList
            Movie movie = new Movie(name, rating, year, runtime, stars);
            myCollection.add(movie);
        }

        // step 3: printing all movies in the collection
        for (Movie movie : myCollection) {
            System.out.println(movie.toString());
        }

        // step 4: searching for a movie title substring
        System.out.println("Enter a substring to search for in movie titles: ");
        String searchString = stdin.next();
        for (Movie movie : myCollection) {
            if (movie.getName().contains(searchString)) {
                System.out.println("Found movie: " + movie.getName());
            }
        }

        // step 5: finding movie with the longest runtime
        Movie longestMovie = myCollection.get(0);
        for (Movie movie : myCollection) {
            if (movie.getRunTime() > longestMovie.getRunTime()) {
                longestMovie = movie;
            }
        }
        System.out.println("The movie with the longest runtime is: " + longestMovie.getName());

        stdin.close();
    }
}
