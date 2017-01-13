package Koehler;

import java.util.Scanner;

/**
 * Created by HKoehler on 1/13/17.
 */
public class ConsoleTestApp {

    public static void main(String[] args) {

        // initiate Scanner and Koehler.Console Class
        Scanner sc = new Scanner(System.in);
        Console console = new Console(sc);

        console.println("Testing Koehler.Console Class...");
        console.println(); // skip a line

        console.getInt("Enter an Integer: ");
        console.getIntWithinRange("Enter an Integer between 1 and 100: ", 1, 100);
        console.getDouble("Enter a Double (decimal): ");
        console.getDoubleWithinRange("Enter a Double between 1 and 100: ", 1, 100);
        console.getRequiredString("Enter a word or sentence: ");
        console.getChoiceString("Enter either 'beer' or 'wine': ", "beer", "wine");

        console.println(); // skip a line
        console.println("Testing complete. Goodbye.");

    }
}
