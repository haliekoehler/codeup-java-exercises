/**
 * Created by HKoehler on 1/4/17.
 */


    // TODO Write a program that prints the numbers from 1 to 100.
    // For multiples of three print “Fizz” instead of the number
    // For the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.

public class Fizzbuzz {
    public static void main(String[] args) {

        int i = 1;
        do {
            if (i % 3 == 0 && i % 5== 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
