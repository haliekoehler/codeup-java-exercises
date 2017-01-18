import java.util.*;
import java.util.Collections;

/**
 * Created by HKoehler on 1/17/17.
 */
public class MoviesByCategoryApp {

    public static void main(String[] args) {

        // Initialize
        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator(scan);

        int userInput;
        String userContinue;

        // Print App Title
        printAppTitle();

        // Make new ArrayList from MovieIO
        ArrayList<Movie> moviesList = makeMovieList();

        // Sort Movies by Category
        sortByCategory(moviesList);

        printAllMovies(moviesList);

        System.out.println("To search movies by category, please enter corresponding number");

        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("       [1]-Animated      [2]-Comedy       [3]-Drama            ");
            System.out.println("       [4]-Horror        [5]-Sci-Fi       [6]-All Movies       ");
            System.out.println("---------------------------------------------------------------");
            System.out.println(); // skip line

            // Get user's number between 1 - 6
            userInput = validate.getIntWithinRange("", 1, 6);

            // Get movies based on userInput
            getMoviesByCategory(userInput, moviesList);
            System.out.println(); // skip line

            // Ask user to search for another
            System.out.print("Would you like to continue searching? yes / no   ");
            userContinue = scan.next();

        } while (userContinue.equalsIgnoreCase("y") || userContinue.equalsIgnoreCase("yes"));

        System.out.println(); // skip line
        System.out.println("Thank you for using the Movie App! Goodbye!");
    }

    // Build ArrayList from MovieIO class
    public static ArrayList<Movie> makeMovieList (){

        // Make new ArrayList for Movies
        ArrayList<Movie> moviesList = new ArrayList<>();

        // Add movies in MovieIO to new moviesList
        for (int i = 1; i <= 100; i++ ){
            moviesList.add(MovieIO.getMovie(i));
            i++;
        }

        return moviesList;
    }

    // Sort Movies Alphabetically by Category
    public static ArrayList<Movie> sortByCategory (ArrayList<Movie> array){

        Collections.sort(array, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie2, Movie movie1) {
                return movie2.getCategory().compareTo(movie1.getCategory());
            }
        });

        return array;
    }

    public static ArrayList<Movie> sortByTitle (ArrayList<Movie> array){

        Collections.sort(array, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie2, Movie movie1) {
                return movie2.getTitle().compareTo(movie1.getTitle());
            }
        });

        return array;
    }

    // Get Movies by Category based on user input
    public static void getMoviesByCategory (int userInput, ArrayList<Movie> array){

        sortByTitle(array);

        switch (userInput){
            case 1:
                printCategory(array, "animated");
                break;
            case 2:
                printCategory(array, "comedy");
                break;
            case 3:
                printCategory(array, "drama");
                break;
            case 4:
                printCategory(array, "horror");
                break;
            case 5:
                printCategory(array, "scifi");
                break;
            case 6:
                printAllMovies(array);
                break;
            default:
                System.out.println("Something went wrong, please try again");
        }
    }

    // Print movies in specific category
    public static void printCategory (ArrayList<Movie> array, String category){

        int numberInCategory = 0;

        System.out.println("-- " + category.toUpperCase() + " --");
        for(Movie movie : array) {
            if (category.equalsIgnoreCase(movie.getCategory())) {
                System.out.printf("%-35s", movie.getTitle());
                numberInCategory++;
                System.out.println(); // next line
            }
        }

        System.out.println(); // skip line before number of movies prints
        if (numberInCategory == 1){
            System.out.println(numberInCategory + " movie was found in the " + category + " category.");
        } else {
            System.out.println(numberInCategory + " movies were found in the " + category + " category.");
        }

        System.out.println(); //skip line before next prompt
    }

    // Print Entire movieList (Title and Category)
    public static void printAllMovies (ArrayList<Movie> array){
        for(Movie movie : array) {
            System.out.printf("%-35s %-20s", movie.getTitle(), movie.getCategory());
            System.out.println(); // next line
        }
    }

    // Print App's Title
    public static void printAppTitle (){
        System.out.println("                        WELCOME TO THE ");
        System.out.println("                     +-+-+-+-+-+ +-+-+-+\n" +
                "                     |M|O|V|I|E| |A|P|P|\n" +
                "                     +-+-+-+-+-+ +-+-+-+");
        System.out.println(); // skip line
    }

}

        // The application stores a list of 10 movies and displays them by category.
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