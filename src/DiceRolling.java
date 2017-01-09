import java.util.Scanner;

/**
 * Created by HKoehler on 1/5/17.
 */

public class DiceRolling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userContinue;
        String userRoll;
        int userNumber;

        do {
            System.out.print("Choose number of sides for a pair of dice: ");
            userNumber = sc.nextInt();
            Die dice = new Die(userNumber);
            System.out.print("Type 'roll' when you are ready to roll the dice!");
            userRoll = sc.next().trim();

            if (userRoll.equals("roll")) {
                int dieOne = dice.roll(userNumber);
                int dieTwo = dice.roll(userNumber);

                System.out.println();
                System.out.println("Die one: " + dieOne);
                System.out.println("Die two: " + dieTwo);
                System.out.println();
                System.out.println("The total of both equals " + (dieOne + dieTwo));
                System.out.println();

            } else {
                System.out.println("Something went wrong...");
            }

            System.out.print("Would you like to do this again? yes/no");
            userContinue = sc.next().trim();
        } while (userContinue.equals("yes"));

        System.out.println("Thanks for using the Dice Roller App! Bye!");
    }
}
