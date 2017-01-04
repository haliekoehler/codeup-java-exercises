
        //TODO Prompt a user to enter a integer and store that value in an integer variable using the nextInt method.
       // What happens if you input something that is not an integer?
       // TODO Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
       // do you capture all of the words?
       // TODO Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
       // What happens if you enter less than 3 words?

import java.util.Scanner;

/**
 * Created by HKoehler on 1/3/17.
 */
public class ScannerDemo {
    public static void main(String[] args) {

        // new scanner
        Scanner sc = new Scanner(System.in);

        // user Int
        int userInput;

        System.out.print("Enter a Integer: ");
        userInput = sc.nextInt();
        System.out.println("Your Int is: " + userInput);

        sc.nextLine(); // make sure to not skip next input

        System.out.println(""); // adding a line to space out text

        // user Sentence
        String userInput2;

        System.out.print("Enter Sentence: ");
        userInput2 = sc.nextLine();
        System.out.println("Your sentence is: " + userInput2);

        // ask for three words
        String firstWord;
        String secondWord;
        String thirdWord;

        // three words prompts
        System.out.println("");
        System.out.println("Enter Three Words! ");
        System.out.print("First word: ");
        firstWord = sc.nextLine();
        System.out.print("Second word: ");
        secondWord = sc.nextLine();
        System.out.print("Third word: ");
        thirdWord = sc.nextLine();
        System.out.println("Your 3 words are: '" + firstWord + "' , '" + secondWord + "', " + "and '" + thirdWord +"'!");
        System.out.println("");

        // ask for room deminsions
        double height;
        double width;
        double length;
        boolean keepMeasuring = true;
        String userContinue;

        do {
            System.out.println("Let's measure a room!");
            System.out.print("Enter room's length: ");
            length = sc.nextDouble();
            System.out.print("Enter room's width: ");
            width = sc.nextDouble();
            System.out.print("Enter room's height: ");
            height = sc.nextDouble();
            System.out.println("");
            System.out.println("Room Measurements: ");
            System.out.println("Perimeter - " + 2 * (length + width));
            System.out.println("Area -  " + (length * width));
            System.out.println("Volume - " + (length * height * width));
            sc.nextLine();
            System.out.println("");
            System.out.println("Would you like to measure another room? Type 'yes' to continue, 'no' to exit");
            userContinue = sc.nextLine();

        } while(userContinue.equals("yes"));

        System.out.println("Thank you! Bye!");
    }
}
