/**
 * Created by HKoehler on 1/4/17.
 */
public class LoopBasics {
    public static void main(String[] args) {

        // 1. While
        // TODO Create a variable i that starts at 5.
        // Create a while loop that checks i <= 15 and increment i by 1 inside the loop.
        // Before incrementing i, output each iteration and display results.

        System.out.println("Printing 5 through 15...");
        int i = 5;
        while (i <= 15) {
            System.out.println("i -> " + i);
            i++;
        }

        System.out.println("");

        // 2. Do While
        // TODO Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Follow each number with a new line.
        // Alter your loop to count backwards by 5's from 100 to -10.
        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

        System.out.println("Printing 2's until 100...");
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

        System.out.println("");
        System.out.println("Printing 100 to -10 by 5's...");

        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);

        System.out.println("");
        System.out.println("Now squaring 2 until 1,000,000... ");

        long l = 2;
        do {
            System.out.println(l);
            l *= l;
        } while (l <= 1000000);

        // 3. For
        // TODO refactor the previous two exercises to use a for loop instead

        System.out.println("");
        System.out.println("Redone as for Loops...");

        for(int m = 5; m <= 15; m++)
        {
            System.out.println(m);
        }

        System.out.println("");

        for(int n = 0; n <= 100; n += 2)
        {
            System.out.println(n);
        }

        System.out.println("");

        for(int o = 100; o >= 100; o-= 5)
        {
            System.out.println(o);
        }

        System.out.println("");

        for(long p = 2; p <= 1000000; p *= p)
        {
            System.out.println(p);
        }
    }
}
