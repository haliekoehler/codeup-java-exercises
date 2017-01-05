import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by HKoehler on 1/5/17.
 */

    // TODO Prompt the user to enter an integer from 1 to 10.
    // Display the factorial of the number entered by the user.
    // Ask if the user wants to continue.
    // Use a for loop to calculate the factorial.
    // Assume that the user will enter an integer, but verify it’s between 1 and 10.
    // Use the long type to store the factorial.
    // Continue only if the user agrees to.
    // A factorial is a number multiplied by each of the numbers before it.
    // Factorials are denoted by the exclamation point (n!). Ex:

    // 1! = 1               = 1
    // 2! = 1 x 2           = 2
    // 3! = 1 x 2 x 3       = 6
    // 4! = 1 x 2 x 3 x 4   = 24

public class CalculateFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userContinue;
        int userNumber;

        do {
            // Prompt User for number 1 - 10
            System.out.print("Enter a number 1 through 10: ");
            userNumber = sc.nextInt();
            sc.nextLine();

            if (userNumber <= 10) {
                System.out.print(userNumber + "! = ");
                for (int i = 1; i <= userNumber; i++) {
                    System.out.print(i);
                    if (i < userNumber) {
                        System.out.print(" x ");
                    } else {
                        System.out.print(" = ");
                    }
                }
                System.out.println(calculateFact(userNumber));
            } else {
                System.out.println("That is not a valid number...");
            }

            System.out.println("Would you like to enter another number? yes/no");
            userContinue = sc.nextLine();

        } while (userContinue.equals("yes"));

        System.out.println("----- Program Finished ---- ");
    }

    public static long calculateFact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

}
