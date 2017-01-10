import java.util.Scanner;

/**
 * Created by HKoehler on 1/10/17.
 */
public class ValidatorTestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validator val = new Validator(sc);

        System.out.println("Welcome to the Validator Test Application!");
        System.out.println(); // Skip a line

        System.out.println("--- Int Test ---");
        val.getIntWithinRange("Enter an Integer between -100 and 100", -100, 100);

        System.out.println(); // Skip a line

        System.out.println("--- Double Test ---");
        val.getDoubleWithinRange("Enter a Double between -100.0 and 100.0", -100.0, 100.0);

        System.out.println(); // Skip a line

        System.out.println("Thanks for using the ValidatorTestApp! Goodbye!");
    }

}
