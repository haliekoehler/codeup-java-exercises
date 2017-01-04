import java.util.Scanner;

/**
 * Created by HKoehler on 1/4/17.
 */

    // TODO Accept a numerical grade from 0 to 100.
    // Display the corresponding letter grade.
    // Prompt the user to continue.
    // Assume that the user will enter valid integers for the grades.
    // The application should only continue if the user agrees to.

public class LetterGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int grade;
        String userContinue;

        System.out.println("---Convert Number Grade to Letter Grade---");


        do {
            System.out.print("Enter number grade: ");
            grade = sc.nextInt();
            sc.nextLine();

            if (grade >= 88) {
                System.out.println("A");
            } else if (grade <= 88 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 79 && grade >= 65) {
                System.out.println("C");
            } else if (grade <= 66 && grade >= 61) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("");
            System.out.println("Would you like to enter another grade? yes/no");
            userContinue = sc.nextLine();

        } while (userContinue.equals("yes"));

        System.out.println("Thanks! Bye!");

    }
}
