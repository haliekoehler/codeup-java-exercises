import java.util.*;
import java.util.Collections;

/**
 * Created by HKoehler on 1/13/17.
 */
public class StudentScoresApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Validator validate = new Validator(scan);

        buildArray(validate, getNumberOfStudents(validate));

    }


    // Get total number of students to be put into ArrayList
    public static int getNumberOfStudents (Validator validate){

        int numberOfStudents;
        numberOfStudents = validate.getIntWithinRange("How many students would you like to enter?: ", 1, 50);
        return numberOfStudents;
    }

    // Build ArrayList of Students by prompting User using Validator Class
    public static ArrayList<Student> buildArray (Validator validate, int number){

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < number; i++){
            String firstName;
            String lastName;
            int score;

            firstName = validate.getWord("Student #" + (i + 1) + " First Name: ");
            lastName = validate.getWord("Student #" + (i + 1) + " Last Name: ");
            score = validate.getIntWithinRange("Student #" + (i + 1) + " Score : ", 0, 100);
            System.out.println();

            Student x = new Student (firstName, lastName, score);

            students.add(x);
        }

        // Sort alphabetically by Student's Last Name
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getLastName().compareTo(student2.getLastName());
            }
        });

        // Print out Student List2
        System.out.println("");
        System.out.println("------------- Student List --------------");
        System.out.println("Last Name      First Name      Score    ");
        System.out.println("-----------------------------------------");

        for (int i = 0; i <students.size(); i++){
            System.out.printf("%-14s %-15s %-19s", students.get(i).getLastName(), students.get(i).getFirstName(), students.get(i).getAge());
            System.out.println(); // new line
        }

        return (students);
    }

}




    // TODO Student Scores App Exercise - Instructions
    // The application accepts last name, first name, and score for one or more students and stores the results in an array.
    // The application prints the student name and their score alphabetically by last name.
    // The program should implement a class called Student that stores last name, first name, and score for each student.
    // The class should implement the Comparable interface so that students can be sorted by name.
    // The program should use an Array to store Student objects. It should sort the array prior to printing the student list.
    // Validate user input so that the number of students can only be a positive integer,
    // the last name and first name values cannot be empty Strings, and the score is an integer from 0 and 100.