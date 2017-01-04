import java.util.Scanner;

/**
 * Created by HKoehler on 1/4/17.
 */


    // TODO Prompt the user to enter an integer.
    // Display a table of squares and cubes from 1 to the value entered.
    // Ask if the user wants to continue.
    // Assume that the user will enter valid data.
    // Only continue if the user agrees to.

public class TableOfPowers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;
        int number;

        do {
            System.out.print("Enter Integer: ");
            number = sc.nextInt();

            System.out.println("Number    | Square    | Cube    ");
            System.out.println("--------------------------------");

            for (int i = 1; i <= number; i++) {
                System.out.printf("%10s %10s %10s", i, i*i, i*i*i);
                System.out.println();
            }
            System.out.println("Do you want to continue? yes/no");
            userInput = sc.next();
        } while (userInput.equals("yes"));

        System.out.println("Thank you! Bye");

//        int userInt;
//        int i = 2;
//        int j = 1;
//        String toContinue;
//
//        // Prompting User for Number
//        System.out.println("Enter a number: ");
//        userInt = sc.nextInt();
//
//        System.out.println("You entered: " + userInt);
//
//        System.out.println("Square Roots up to " + userInt);
//        System.out.println("");
//
//        // Square Roots
//        do {
//            System.out.println(i);
//            i*= i;
//        } while (i <= userInt);
//
//        System.out.println("");
//        System.out.println("Cubed Numbers up to " + userInt);
//        System.out.println("");

        // Cubed Numbers
//        do{
//            System.out.println(j);
//            Math.pow(j, 3);
//        } while (j <= userInt);
    }
}
