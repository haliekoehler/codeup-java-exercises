import java.util.Scanner;

/**
 * Created by HKoehler on 1/6/17.
 */

public class HelloObjectWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Information for User 1: ");
        Person userOne = new Person(getFirstName(sc), getLastName(sc), getEmail(sc));
        System.out.println(returnInfo(userOne));
        System.out.println("");
        System.out.println("Please Enter Information for User 2: ");
        Person userTwo = new Person(getFirstName(sc), getLastName(sc), getEmail(sc));
        System.out.println(returnInfo(userTwo));
        System.out.println("");
        System.out.println("Please Enter Information for User 3: ");
        Person userThree = new Person(getFirstName(sc), getLastName(sc), getEmail(sc));
        System.out.println(returnInfo(userThree));
        System.out.println("");

        System.out.println("Thanks, " + userOne.firstName + ", " + userTwo.firstName + ", and " + userThree.firstName + "! ");
        System.out.println("Your information has been saved!");

    }

    // Get User's First Name
    public static String getFirstName (Scanner sc){
        String first;
        System.out.print("First Name: ");
        first = sc.nextLine();
        return first;
    }
    // Get User's Last Name
    public static String getLastName (Scanner sc){
        String last;
        System.out.print("Last Name: ");
        last = sc.nextLine();
        return last;
    }
    // Get User's Email
    public static String getEmail (Scanner sc){
        String email;
        System.out.print("Email: ");
        email = sc.nextLine();
        return email;
    }
    // Return User's Information
    public static String returnInfo (Person user){
        String message = "Thank you, " + user.firstName + " " + user.lastName + "! We have your email as " + user.email + ".";
        return message;
    }
}

