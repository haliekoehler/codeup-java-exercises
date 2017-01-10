import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {


        System.out.println("Welcome to the Student Records App");

        System.out.println("Please input a new student ");

        String firstName = getString("First name: ");
        String lastName = getString("Last name: ");
        int age = getInt("Age: ");

        Student newStudent = new Student(firstName, lastName, age);
        System.out.println("Hello, " + newStudent.getFirstName() + " " + newStudent.getLastName() + ". You are " + newStudent.getAge() + " years old.");
    }

    public static String getString (String prompt){
        Scanner scan = new Scanner(System.in);
        String inputString;

        System.out.println(prompt);
        try {
            inputString = scan.nextLine();
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            return getString(prompt);
        }
        return inputString;
    }

    public static int getInt(String prompt){
        Scanner scan = new Scanner(System.in);
        int userInteger;

        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Your input must be an integer, nothing else!");
            return getInt(prompt);
        }

        return userInteger;
    }
}


//        System.out.println("Please enter student's information: ");
//        Student newStudent = new Student(getFirstName(sc), getLastName(sc), getAge(sc));
//
//        System.out.println("Thank you! We have stored the follow information: ");
//        System.out.println("Name: " + newStudent.firstName + " " + newStudent.lastName + " Age: " + newStudent.age);
//    }
//
//    public static String getFirstName(Scanner sc) {
//        String firstName;
//            try {
//                System.out.println("Student's first name: ");
//                firstName = sc.nextLine();
//            } catch (Exception e) {
//                sc.next(); // discard incorrect information
//                System.out.println("Invalid input, try again!");
//                throw e;
//            }
//            return firstName;
//    }
//
//    public static String getLastName(Scanner sc) {
//        String lastName;
//        System.out.println("Student's last name: ");
//        lastName = sc.nextLine();
//        return lastName;
//    }
//
//    public static int getAge(Scanner sc) {
//            int age;
//            try {
//                System.out.println("Student's age: ");
//                age = sc.nextInt();
//
//            } catch (Exception e) {
//                sc.next(); //discard incorrect info
//                String message = "Invalid input, try Again!";
//                System.out.println(message);
//                getAge(sc);
//            }
//        return age;
//        }
//    }