import java.util.Random;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/11/17.
 *
 * TO DO:
 * Create two arrays.
 * One with at least 10 adjectives.
 * Another with at least 10 nouns.
 * Create a function that will return a random element from an array.
 * Display to the user their generated server name (that is, a randomly generated adjective + noun).
 */

public class ServerNameGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO THE SERVER NAME GENERATOR!");

        promptUser(scan);

    }

    //prompt user to begin
    private static void promptUser (Scanner scan){

        String userResponse;

        System.out.println("To Generate a server name, type 'GO'");
        userResponse = scan.next();

        if (userResponse.equalsIgnoreCase("go")){
            generateName(scan);
        } else {
            System.out.println("Invalid input, let's try that again...");
            promptUser(scan);
        }

    }

    // Generate Name (from adjectiveArray and nounArray)
    private static void generateName (Scanner scan){

        String [] adjectiveArray = {"Sleepy", "Slow", "Hyper", "Speedy", "Rowdy", "Outrageous", "Plotting", "Grumpy", "Starving", "Cocky"};
        String [] nounArray = {"Wheelchair", "Master Shake", "Troll", "UFO", "Vampire", "Cartman", "Mike Tyson", "Tugboat", "Jedi", "Orc"};
        String userGenerates;
        String serverName;

        serverName = getRandom(adjectiveArray) + " " + getRandom(nounArray);
        System.out.println();
        System.out.println("Your server name is: ");
        System.out.println("** " + serverName + " **");
        System.out.println();

        userContinue(scan);
    }

    // Get random Array Index
    private static String getRandom (String[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    // Ask user if they'd like to generate another name
    private static void userContinue (Scanner scan){

        String userContinue;

        System.out.println("Would you like to generate another? yes / no");
        userContinue = scan.next();

        if (userContinue.trim().equalsIgnoreCase("yes")){
            generateName(scan);
        } else if (userContinue.trim().equalsIgnoreCase("no")){
            System.out.println("Thank you for using the Server Name Generator. Good Bye!");
        } else {
            System.out.println("I'm not sure what you're trying to say. So I'll ask you again.");
            userContinue(scan);
        }
    }
}
