import java.util.Scanner;

/**
 * Created by HKoehler on 1/10/17.
 */
public class ValidatorTestApp {

    public static void main(String[] args) {

        int userInt;
        double userDouble;

        Scanner sc = new Scanner(System.in);
        Validator val = new Validator(sc);

        System.out.println("Welcome to the Validator Test Application!");
        System.out.println();

        System.out.println("--- Int Test ---");
        val.getInt("Enter an Integer between -100 and 100");

        System.out.println("--- Double Test ---");
        System.out.print("Enter any number between -100 and 100: ");
        userDouble = sc.nextDouble();
    }

}
