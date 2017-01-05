import java.util.Scanner;

/**
 * Created by HKoehler on 1/5/17.
 */

    // TODO Create an application that simulates dice rolling.
    // Ask the user to enter the number of sides for a pair of dice.
    // Prompt the user to roll the dice.
    // “Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    // Use static methods to implement the method(s) that generate the random numbers.
    // Experiment with different Random number generators –start with the random() method of the Math class but also explore Java’s Random class.

public class DiceRolling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userRoll;
        int userNumber;


        System.out.print("Choose number of sides for a pair of dice: "); // prompt user for sides of dice
        userNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Type 'roll' to roll the dice!"); // trigger randomNumber function
        userRoll = sc.next().trim();

            // makes sure user typed 'roll' properly
            if (userRoll.equals("roll")) {
                System.out.println("Dice 1: " + randomNumber(userNumber));
                System.out.println("Dice 2: " + randomNumber(userNumber));
            } else {
                System.out.println("Something went wrong.");
            }
    }

    // get random number based on "userNumber"
    public static int randomNumber (int a){
        int max = a;

        int random = (int)(Math.random() * max + 1);
        return random;
    }

}
