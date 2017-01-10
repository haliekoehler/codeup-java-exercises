import java.util.Scanner;

/**
 * Created by HKoehler on 1/10/17.
 */

public class HighLowGameApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("*** HIGH / LOW Guessing Game ***");
        System.out.println("================================");
        System.out.println("The computer will chose a number between 1 and 100 \nThen it's your job to guess what it is!");
        System.out.println("================================");

        startGame(scan);
    }

    private static void startGame (Scanner scan){

        int compNumber;

        String userStart;
        Validator validate = new Validator(scan);

        System.out.println("Type START to begin!");
        userStart = scan.next();

        if (userStart.equalsIgnoreCase("start")) {
            compNumber = compTurn();
            System.out.println("Now it's your turn!");
            userTurn(scan, validate, compNumber);
        } else {
            System.out.println("Hmmm, okay... well, whenever you're ready...");
            startGame(scan);
        }
    }

    // Computer picks random number between 1 - 100
    private static int compTurn (){
        int compNumber = (int)Math.ceil(Math.random() * 100); // computer picks random number
        System.out.println(); // Skip a Line
        System.out.println("Computer has chosen a number!");
        System.out.println(); // Skip a Line
        return compNumber;
    }

    // User guess
    private static void userTurn (Scanner scan, Validator validator, int compNumber){
        int userGuess;

//        userGuess = scan.nextInt();

        userGuess = validator.getIntWithinRange("Guess a number between 1 - 100: ", 1, 100);

        if (userGuess == compNumber){
            System.out.println("GOOD GUESS! YOU WIN!");
            System.out.println("Would you like to play again? yes / no");
            String userContinue = scan.next();
                if (userContinue.equalsIgnoreCase("yes")){
                    startGame(scan);
                } else {
                    System.out.println("Thanks for playing! Goodbye!");
                }
        } else if (userGuess < compNumber){
            System.out.println("HIGHER!");
            userTurn(scan, validator, compNumber);
        } else if (userGuess > compNumber){
            System.out.println("LOWER!");
            userTurn(scan, validator, compNumber);
        }
    }
}
