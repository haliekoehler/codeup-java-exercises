package Koehler;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/13/17.
 */
public class Console {

    private Scanner sc;

    /**
     * Constructor for Console Class
     * @param sc - Scanner class
     */
    public Console (Scanner sc){
      this.sc = sc;
    }

    /**
     * Prints string without skipping line
     * @param s - String to be printed out
     */
    public void print(String s){
        System.out.print(s);
    }

    /**
     * Prints string and skips line
     * @param s - String to be printed out
     */
    public void println(String s){
        System.out.println(s);
    }

    /**
     * Skips a line
     */
    public void println(){
        System.out.println();
    }

    /**
     * Checks if input is a valid String
     * @param prompt - String prompting user input information
     * @return - user's input if valid
     */
    public String getRequiredString(String prompt){

        String userString;
        print(prompt);

        try {
            userString = sc.nextLine().trim();
        } catch (IllegalStateException e){
            println("That is not a valid string");
            return getRequiredString(prompt);
        }

        return userString;
    }

    /**
     * Gets one of two specified Strings.
     * Uses getRequiredString(prompt) to verify correct data type
     * @param prompt - String prompting user input information
     * @param s1 - First choice of Strings
     * @param s2 - Second choice of Strings
     * @return - user's input if valid
     */
    public String getChoiceString(String prompt, String s1, String s2){

        String userString;
        println(prompt);

        userString = getRequiredString(prompt).trim();

        if (userString.equalsIgnoreCase(s1) || userString.equalsIgnoreCase(s2)){
            return userString;
        } else {
            println("Invalid Information. Try Again");
        }

        return userString;
    }

    /**
     * Checks if input is valid Integer
     * @param prompt - String prompting user input information
     * @return - user's input if valid
     */
    public int getInt(String prompt){
        print(prompt);
        int userInt;

        try{
            userInt = sc.nextInt();
        } catch (InputMismatchException e){
            println("That is not an Integer");
            return getInt(prompt);
        }

        return userInt;
    }

    /**
     * Checks if input is within a range of Integers
     * Uses getInt(prompt) to verify correct data type
     * @param prompt - String prompting user input information
     * @param min - Minimum Integer
     * @param max - Maximum Integer
     * @return - user's input if valid
     */
    public int getIntWithinRange(String prompt, int min, int max){
        // use getInt() to check if input is integer
        int userInt = getInt(prompt);

        try {
            if (userInt < min || userInt > max){
                throw new IllegalArgumentException("Number is out of Range. Try Again.");
            }
        } catch (IllegalArgumentException e){
            println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }

        return userInt;
    }

    /**
     * Checks if input is valid Double
     * @param prompt - String prompting user input information
     * @return - user's input if valid
     */
    public double getDouble(String prompt){
        double userDouble;
        print(prompt);

        try{
            userDouble = sc.nextDouble();
        } catch (InputMismatchException e){
            println("That is not an Integer. Try Again");
            return getDouble(prompt);
        }
        return userDouble;
    }

    /**
     * Checks if input is Double within range of Doubles
     * Uses getDouble(prompt) to verify correct data type
     * @param prompt - String prompting user input information
     * @param min - Minimum Double
     * @param max - Maximum Double
     * @return - user's input if valid
     */
    public double getDoubleWithinRange(String prompt, double min, double max){
        double userDouble;
        print(prompt);

        try {
            userDouble = sc.nextDouble();
            if (userDouble < min || userDouble > max){
                throw new IllegalArgumentException("Double is out of Range. Try Again.");
            }
        } catch (NoSuchElementException | IllegalStateException | IllegalArgumentException e){
            println("Something went wrong... Try Again");
            return getDoubleWithinRange(prompt, min, max);
        }
        return userDouble;
    }
}
