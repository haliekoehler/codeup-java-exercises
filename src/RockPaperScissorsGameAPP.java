import java.util.Scanner;

/**
 * Created by HKoehler on 1/18/17.
 */
public class RockPaperScissorsGameAPP {

    public static void main(String[] args) {

        // Initialize
        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator(scan);

        // Variables
        String userName;
        String CPUopponent;
        String userSelection;
        String CPUSelection;
        int wins;
        int loses;

        // Create CPU Player
        CPUPlayer cpuPlayer1 = new CPUPlayer("Mr. Computer");
        CPUPlayer cpuPlayer2 = new CPUPlayer("Uncle Machine");

        // Create User Player
        userName = validate.getString("Welcome player! Please enter your name: ");
        HumanPlayer user = new HumanPlayer(userName);

        // Chose CPU to play against
        CPUopponent = chooseOpponent(validate, cpuPlayer1, cpuPlayer2);

        // Prompt User for Selection
        userSelection = userSelection(validate);




    }


    // Validate user Selection
    public static String userSelection (Validator validate){
        String userSelection;

        userSelection = validate.getString("ROCK, PAPER, or SCISSORS?");

        if (userSelection.toUpperCase().equals("ROCK") || userSelection.toUpperCase().equals("PAPER") || userSelection.toUpperCase().equals("SCISSORS")){
            return userSelection;
        } else {
            System.out.println("That's not a valid selection. Try Again.");
            userSelection(validate);
        }

        return userSelection;
    }

    // User chooses opponent
    public static String chooseOpponent (Validator validate, CPUPlayer comp1, CPUPlayer comp2){

    }

    // Print main title for the game
    public static void printTitle (){
        System.out.println("______           _     ______                       _____      _                        \n" +
                "| ___ \\         | |    | ___ \\                     /  ___|    (_)                       \n" +
                "| |_/ /___   ___| | __ | |_/ /_ _ _ __   ___ _ __  \\ `--.  ___ _ ___ ___  ___  _ __ ___ \n" +
                "|    // _ \\ / __| |/ / |  __/ _` | '_ \\ / _ \\ '__|  `--. \\/ __| / __/ __|/ _ \\| '__/ __|\n" +
                "| |\\ \\ (_) | (__|   <  | | | (_| | |_) |  __/ |    /\\__/ / (__| \\__ \\__ \\ (_) | |  \\__ \\\n" +
                "\\_| \\_\\___/ \\___|_|\\_\\ \\_|  \\__,_| .__/ \\___|_|    \\____/ \\___|_|___/___/\\___/|_|  |___/\n" +
                "                                 | |                                                    \n" +
                "                                 |_|                                                    ");
    }


}




        // TODO Create rock, paper, scissors game

                // Prompt the player to enter a name and select an opponent.
        // Prompt the player to select rock, paper, or scissors. Then display the player’s choice,
        // the opponent’s choice, and the result of the match.
        // Continue until the user doesn’t want to play anymore.
        // If the user makes an invalid selection, display an appropriate error message
        // and prompt the user again until the user makes a valid selection.

        // Create an enumeration called Roshambo that stores three values: rock, paper, and scissors.
        // This enumeration should include a toString method that can convert the selected value to a String.

        // Create an abstract class named Player that stores a name and a Roshambo value.
        // This class should include an abstract method named generateRoshambo that allows an inheriting class to generate
        // and return a Roshambo value.

        // Create and name two player classes (subclasses of Player).
        // One of these players should always select rock.
        // The other player should randomly select rock, paper, or scissors (a 1 in 3 chance of selecting each).
        // Create a third player class that extends Player and implements the generateRoshambo method.

        // For this class, generateRoshambo gets input from the human player and returns the value chosen.

        // Create a class called RoshamboApp that allows the user to play against either of your first two player classes.

                    // Use a Validator class to validate the user’s entries.

        // Bonus

        // Keep track of wins and losses, and display them at the end of each session.