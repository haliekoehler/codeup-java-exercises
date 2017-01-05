import java.util.Scanner;

/**
 * Created by HKoehler on 1/5/17.
 */


        //TODO Create four separate methods. Each will perform an arithmetic operation:
        // Add, Subtract, Multiply, Divide
        // Each function needs to take two parameters/arguments so that the operation can be performed.
        // Test your functions and verify the output.
        // Add a modulus function that finds the modulus of two numbers.
        // Food for thought: What happens if we try to divide by zero? What should happen?


public class BasicArithmetic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String userContinue;
        String userOpChoice;
        int a;
        int b;
        int addSum;
        int subSum;
        int multSum;
        double divSum;


        System.out.println("Let's do some Math!");

            System.out.print("Would you like to add, subtract, multiply, or divide?"); // ask for +, -, *, or /
            userOpChoice = scan.nextLine().trim();

            System.out.print("Enter first number in equation: "); // get first number - a
            a = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter second number in equation: "); // get second number - b
            b = scan.nextInt();
            scan.nextLine();

            if (userOpChoice.equals("add")) {
                addSum = add(a, b);
                System.out.println(a + " + " + b + " = " + addSum);
            } else if (userOpChoice.equals("subtract")) {
                subSum = sub(a, b);
                System.out.println(a + " - " + b + " = " + subSum);
            } else if (userOpChoice.equals("multiply")) {
                multSum = mult(a, b);
                System.out.println(a + " * " + b + " = " + multSum);
            } else if (userOpChoice.equals("divide")) {
                divSum = div(a, b);
                System.out.println( a + " / " + b + " = " + divSum);
            }

    }

    // Add two Ints
    public static  int add(int a, int b) {
        return a + b;
    }

    // Sub two Ints
    public static  int sub(int a, int b){
        return a - b;
    }

    // Mult two Ints
    public static int mult(int a, int b){
        return a * b;
    }

    // Div two Ints
    public static double div(int a, int b){
        return (double) a / b;
    }
}
