import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/10/17.
 */
public class Validator {


    private Scanner sc;

    // CONSTRUCTOR
    public Validator (Scanner sc){
        this.sc = sc;
    }

    // Get userInt
    public int getInt (String prompt){
        System.out.print(prompt);
        int userInt;

        try{
            userInt = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("That is not an Integer");
            sc.next();
            return getInt(prompt);
        }

        return userInt;
    }


    // Validate passed int within a certain range
    public int getIntWithinRange (String prompt, int min, int max){
        // use getInt() to check if input is integer
        int userInt = getInt(prompt);

        try {
            if (userInt < min || userInt > max){
                throw new IllegalArgumentException("Number is out of Range. Try Again.");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            sc.next();
            return getIntWithinRange(prompt, min, max);
        }

        return userInt;
    }

    // Get userDouble
    public double getDouble (String prompt){

        double userDouble;
        System.out.println(prompt);

        try{
            userDouble = sc.nextDouble();
        } catch (Exception e){
            System.out.println("ERROR - Invalid input");
            sc.next();
            return getDouble(prompt);
        }
        return userDouble;
    }

    // Validate passed double within certain range
    public double getDoubleWithinRange (String prompt, double min, double max){
        double userDouble;
        System.out.println(prompt);

        try {
            userDouble = sc.nextDouble();
            if (userDouble < min || userDouble > max){
                throw new IllegalArgumentException("Double is out of Range. Try Again.");
            }
        } catch (NoSuchElementException | IllegalStateException | IllegalArgumentException e){
            System.out.println("ERROR - Invalid input");
            sc.next();
            return getDoubleWithinRange(prompt, min, max);
        }
        return userDouble;
    }

    // Get Single Word
    public String getWord(String prompt){
        String userString;
        System.out.print(prompt);
        try{
            userString = sc.next();
        } catch (Exception e){
            System.out.println("ERROR - Invalid input");
            sc.next();
            return getWord(prompt);
        }

        return userString;
    }

     // Get String
    public String getString(String prompt){
        String userString;
        System.out.print(prompt);
        try{
            userString = sc.nextLine();
        } catch (Exception e){
            System.out.println("Something went wrong. Try again");
            return getString(prompt);
        }

        return userString;
    }

    // Validate passed string
    public String getRequiredString (String input, Scanner scan) {
        String userString = scan.next();

        if (userString.equalsIgnoreCase(input)) {
            return userString;
        } else {
            System.out.println("Incorrect input. Please Try Again.");
            return getRequiredString(input, scan);
        }
    }
}








