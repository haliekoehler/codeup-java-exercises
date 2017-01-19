import sun.plugin2.gluegen.runtime.CPU;

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
        CPUPlayer CPUOpponent;
        String userSelection;
        String CPUSelection;
        String userContinue;
        String outcome;
        int wins = 0 ;
        int loses = 0;

        // Print Title for Game
        printTitle();
        System.out.println(); // skip line before Welcome text

        // Create 2 CPU Player Options
        CPUPlayer cpuPlayer1 = new CPUPlayer("Mr. Computer");
        CPUPlayerRock cpuPlayer2 = new CPUPlayerRock("Uncle Machine");

        // Create User Player
        userName = validate.getString("Welcome! Please enter your name: ");
        HumanPlayer user = new HumanPlayer(userName);
        System.out.println(); // skip line

        // Have User choose CPU to play against
        CPUOpponent = chooseOpponent(validate, cpuPlayer1, cpuPlayer2);

        do {
            // Prompt User for Selection
            userSelection = userSelection(scan, validate);

            // CPU makes selection
            CPUSelection = CPUSelection(CPUOpponent);

            // Compare user to CPU's selection
            outcome = compareSelection(userSelection, CPUSelection, CPUOpponent, user);
            System.out.println(outcome);

            // Increment Wins / Loses based on outcome
            if (outcome.contains("WIN")){
                wins++;
            } else if (outcome.contains("LOSE")){
                loses++;
            }

            System.out.println(); // skip line
            // Ask to play again
            System.out.print("Would you like to play again? yes / no  ");
            userContinue = scan.next();
            System.out.println(); // skip line

        } while (userContinue.equalsIgnoreCase("y") || userContinue.equalsIgnoreCase("yes"));


        // Display Score
        System.out.println("----- SCORES -----");
        System.out.println(user.name + ": " + wins);
        System.out.println(CPUOpponent.name + ": " + loses);

        System.out.println("Thank you for playing! Goodbye!");
    }


    // User chooses opponent
    public static CPUPlayer chooseOpponent (Validator validate, CPUPlayer comp1, CPUPlayer comp2){
        int userChoice;
        CPUPlayer chosenPlayer = new CPUPlayer("");

        System.out.println("      Choose your opponent       ");
        System.out.println("---------------------------------");
        System.out.println("Enter [1] for " + comp1.name);
        System.out.println("Enter [2] for " + comp2.name);
        System.out.println("---------------------------------");
        userChoice = validate.getIntWithinRange("Choose your opponent: ", 1, 2);
        System.out.println(); // skip line

        if (userChoice == 1){
            System.out.println("You have chosen " + comp1.name + "! Now let's begin!");
            System.out.println(); // skip line
            chosenPlayer = comp1;
        } else if (userChoice == 2){
            System.out.println("You have chosen " + comp2.name + "! Now let's begin!");
            System.out.println(); // skip line
            chosenPlayer = comp2;
        }

        return chosenPlayer;
    }

    // Validate user Selection
    public static String userSelection (Scanner scan, Validator validate){
        String userSelection;

        System.out.println("Make your selection!");
        System.out.print("ROCK, PAPER, or SCISSORS?  ");
        userSelection = scan.next();

        if (userSelection.toUpperCase().equals("ROCK") || userSelection.toUpperCase().equals("PAPER") || userSelection.toUpperCase().equals("SCISSORS")){
            return userSelection;
        } else {
            System.out.println("That's not a valid selection. Try Again.");
            userSelection(scan, validate);
        }

        return userSelection;
    }

    // CPU makes selection
    public static String CPUSelection (CPUPlayer cpuPlayer){
        Player.Roshambo compPick = cpuPlayer.randomRoshambo();
        return cpuPlayer.generateRoshamboString(compPick);
    }

    // Compare user selection to CPU's selection
    public static String compareSelection (String userSelection, String CPUSelection, CPUPlayer CPUOpponent, HumanPlayer user){

        String message = "";

        System.out.println("-------------------------------");
        System.out.println(user.name + " ---chose---> " + userSelection);
        System.out.println(CPUOpponent.name + " ---chose---> " + CPUSelection);
        System.out.println("-------------------------------");

        if (userSelection.equals(CPUSelection)){
            message = "It's a TIE!";
        } else if (userSelection.equals("ROCK") && CPUSelection.equals("SCISSORS")){
            message = "Rock crushes Scissors! YOU WIN!";
        } else if (userSelection.equals("SCISSORS") && CPUSelection.equals("PAPER")){
            message = "Scissors cut Paper! YOU WIN!";
        } else if (userSelection.equals("PAPER") && CPUSelection.equals("ROCK")){
            message = "Paper covers Rock! YOU WIN!";
        } else if (CPUSelection.equals("ROCK") && userSelection.equals("SCISSORS")){
            message = "Scissors were crushed... YOU LOSE!";
        } else if (CPUSelection.equals("SCISSORS") && userSelection.equals("PAPER")){
            message = "Paper was cut... YOU LOSE!";
        } else if (CPUSelection.equals("PAPER") && userSelection.equals("ROCK")){
            message = "Rock was covered... YOU LOSE!";
        }

        return message;
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