import java.util.Scanner;

/**
 * Created by HKoehler on 1/17/17.
 */
public class CircleCircumferenceApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator(scan);

        System.out.println("---------------- Welcome to the Circle App! ----------------");
        System.out.println("Enter the circle's radius to get the circumference and area!");;
        System.out.println();

        promptUser(validate, scan);
    }

    public static void promptUser (Validator validate, Scanner scan){
        double userRadius;

        userRadius = validate.getDouble("Enter circle's radius: ");

        getMeasurements(userRadius);

        userContinue(validate, scan);
    }

    public static String getMeasurements (double userRadius){
        Circle circle = new Circle (userRadius);

        String circumference = circle.getFormattedArea();
        String area = circle.getFormattedArea();

        return circumference + area;
    }

    public static void userContinue(Validator validate, Scanner scan){
        String userContinue;
        System.out.print("Would you like to make another circle? y/n");
        userContinue = scan.next();

        if (userContinue.equalsIgnoreCase("y")){
            promptUser(validate, scan);
        } else if (userContinue.equalsIgnoreCase("n")){
            System.out.println("Thank for for using the Circle App!");
            System.out.println("You created a total of " + Circle.getObjectCount() + " circles!");
            System.out.println("Goodbye!");
        } else if (!userContinue.equalsIgnoreCase("y") && !userContinue.equalsIgnoreCase("n")) {
            System.out.println("ERROR - Invalid input");
            userContinue(validate, scan);
        }

    }
}


        // TODO Circle Circumference App Instuctions
        // Prompt the user to enter a radius.
        // Display an error if the user enters invalid data.
        // When the user enters valid data, calculate the area and circumference of the circle
        // and rounds to the nearest 2 decimal places.
        // Ask if the user wants to continue.
        // When the user quits, display a “goodbye” message that also indicates the number of circles the user built.
        // For the value of pi, use the PI constant of the java.lang.Math class.
        // Create a class named CircleApp that gets the user input, creates a Circle object,
        // and displays the circumference and area.