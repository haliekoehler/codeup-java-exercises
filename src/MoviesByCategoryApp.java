import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/17/17.
 */
public class MoviesByCategoryApp {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        MovieIO movieIO = new MovieIO();
        ArrayList<Movie> moviesList = makeMovieList(movieIO);

        for(Movie movie : moviesList){
            System.out.println(movie.getTitle() + " (" + movie.getCategory() + ")");
        }

    }

    public static ArrayList<Movie> makeMovieList (MovieIO movieI0){
        ArrayList<Movie> moviesList = new ArrayList<>();

        for (int i = 1; i <= 100; i++ ){
            moviesList.add(movieI0.getMovie(i));
            i++;
        }
        return moviesList;
    }

}

        // The application stores a list of 100 movies and displays them by category.

        // The user can enter any of the following categories to display the films
        // in the list that match the category: animated, drama, horror, scifi.

        // After the list is displayed, the user is asked if he or she wants to continue. If no, the program ends.

        // Each movie should be represented by an object of type Movie.
        // The Movie class must provide two private fields: title and category.
        // Both of these fields should be Strings.
        // The class should also provide a constructor that accepts a title and category as parameters
        // and uses the values passed to it to initialize its fields.

        // When the user enters a category, the program should read through all of the movies in the ArrayList
        // and display a line for any movie whose category matches the category entered by the user.
        // Sufficient tests should be present.

        // Standardize the category codes by displaying a menu of categories
        // and having the user select the category by number rather than entering the name.

        // Display the movies for the selected category in alphabetical order.