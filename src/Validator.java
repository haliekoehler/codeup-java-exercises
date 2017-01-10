import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/10/17.
 */
public class Validator {

    String prompt;
    int userInt;
    double userDouble;

    Scanner sc = new Scanner(System.in);

    public Validator (Scanner sc){

    }

    public int getInt (String prompt){
        int userInt;

        try {
            userInt = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Your input must be an integer, nothing else!");
            return getInt(prompt);
        }

        return getIntWithinRande(prompt, -100, 100);
    }

    public int getIntWithinRande (String prompt, int min, int max){

        min = -100;
        max = 100;
        String toHigh = "Int is greater than " + max + ". Try Again.";
        String toLow = "Int is less than " + min + ". Try Again.";
        String validated = "VALIDATED!";

        try {
            userInt = sc.nextInt();
            if ((userInt >= min && userInt <= max)){
                System.out.println(validated);
            } else if (userInt > max) {
                throw new IllegalArgumentException(toHigh);
                getIntWithinRande(prompt, min, max);
            } else if (userInt < min) {
                throw new IllegalArgumentException(toLow);
                getIntWithinRande(prompt, min, max);
            }
        } catch (Exception e){
            getInt("Something went totally wrong. Please, retry...");
        }

        return userInt;
    }

    public double getDouble (String prompt){

    }

    public double getDoubledWithinRange (String prompt, double min, double max){

    }

    public String getRequiredString (String prompt) {

    }
}
