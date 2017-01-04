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

        int userInt;
        int i = 2;
        int j = 3;
        String toContinue;

        // Prompting User for Number
        System.out.println("Enter a number: ");
        userInt = sc.nextInt();

        System.out.println("You entered: " + userInt);

        System.out.println("Square Roots up to " + userInt);
        System.out.println("");

        // Square Roots
        do {
            System.out.println(i);
            i*= i;
        } while (i <= userInt);

        System.out.println("");
        System.out.println("Cubed Numbers up to " + userInt);
        System.out.println("");

        // Cubed Numbers
//        do{
//            System.out.println(j);
//            (j * j) *= j;
//        } while (j <= userInt);
    }
}
