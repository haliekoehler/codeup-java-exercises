import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/10/17.
 */
public class Validator {

    private int userInt;
    private double userDouble;

    Scanner sc = new Scanner(System.in);

    public Validator (Scanner sc){
        this.sc = sc;
    }

    public int getInt (String prompt){
        return userInt;
    }

    public int getIntWithinRange (String prompt, int min, int max){

        System.out.println(prompt);

        String toHigh = "Int is greater than " + max + ". Try Again.";
        String toLow = "Int is less than " + min + ". Try Again.";
        String notInt = "That is not an integer. Try Again.";
        String validated = "VALIDATED!";

        try {
            userInt = sc.nextInt();
            if ((userInt >= min && userInt <= max)){
                System.out.println(validated);
            } else if (userInt > max) {
                System.out.println(toHigh);
                getIntWithinRange(prompt, min, max);
            } else if (userInt < min) {
                System.out.println(toLow);
                getIntWithinRange(prompt, min, max);
            }
        } catch (InputMismatchException e){
            sc.next(); // discard unwanted info
            System.out.println(notInt);
            getIntWithinRange(prompt, min, max);
        } catch (NoSuchElementException | IllegalStateException e){
            System.out.println("Something went wrong... Try Again");
            getIntWithinRange(prompt, min, max);
        }

        return userInt;
    }

    public double getDouble (String prompt){
        return userDouble;
    }

    public double getDoubleWithinRange (String prompt, double min, double max){
        System.out.println(prompt);

        String toHigh = "Double is greater than " + max + ". Try Again.";
        String toLow = "Double is less than " + min + ". Try Again.";
        String notInt = "That is not an Double. Try Again.";
        String validated = "VALIDATED!";

        try {
            userDouble = sc.nextDouble();
            if ((userDouble >= min && userDouble <= max)){
                System.out.println(validated);
            } else if (userDouble > max) {
                System.out.println(toHigh);
                getDoubleWithinRange(prompt, min, max);
            } else if (userDouble < min) {
                System.out.println(toLow);
                getDoubleWithinRange(prompt, min, max);
            }
        } catch (InputMismatchException e){
            sc.next(); // discard unwanted info
            System.out.println(notInt);
            getDoubleWithinRange(prompt, min, max);
        } catch (NoSuchElementException | IllegalStateException e){
            System.out.println("Something went wrong... Try Again");
            getDoubleWithinRange(prompt, min, max);
        }

        return userDouble;
    }

//    public String getRequiredString (String prompt) {
//
//    }
}
