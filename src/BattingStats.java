import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by HKoehler on 1/11/17.
 * BONUS :
 * At the start of the program, prompt the user for the number of batters to enter,
 * then save the statistics in a two-dimensional array.
 * The program won’t have to prompt the user whether to enter data for another batter
 * since it will know how many batters are to be entered. After all batters have been entered,
 * print a one line summary for each batter.
 *
 * Instead of storing an Array of integers, create a class named AtBat
 * and store instances of this class in the array.
 * This class should define an enumeration named Result with members OUT, SINGLE, DOUBLE, TRIPLE, and HOMERUN.
 * The class should have a constructor that accepts a Result parameter and a method named basesEarned
 * that returns an int representing the number of bases earned for the at bat.
 */

public class BattingStats {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator(scan);

        int numberOfAtBats;
        int sumOfBases;
        double battingAverage;
        double slugPercentage;
        int[] basesEarned;


        System.out.println("Welcome to the Batting Statistics App!");


        // First ask for the number of at bats.
        numberOfAtBats = getNumberOfAtBats(validate);
        System.out.println(); //skip line


        // For each at bat, ask the user for the number of bases earned by the batter.
        basesEarned = getTotalBases(validate, numberOfAtBats);


        // Calculate Batting Average
        battingAverage = getBattingAverage(basesEarned, numberOfAtBats);
        System.out.println("Batting Average: " + battingAverage);


        // Calculate Slugging Percentage
        sumOfBases = IntStream.of(basesEarned).sum();
        slugPercentage = (sumOfBases / numberOfAtBats);

        System.out.println("Slugging Percentage: " + slugPercentage);

    }

    // Ask for Number of At Bats
    public static int getNumberOfAtBats (Validator validate){

        int numberOfAtBats;

        //validate to make sure input is an integer between 1 and 50
        numberOfAtBats = validate.getIntWithinRange("How many times did player go up to bat? ", 1, 50);

        return numberOfAtBats;
    }

    public static int[] getTotalBases (Validator validate, int numberOfAtBats) {

        int[] basesEarned;

        basesEarned = new int[numberOfAtBats];

        for (int i = 0; i < numberOfAtBats; i++) {
            int number = validate.getIntWithinRange("How many bases earned on # " + (i + 1), 0, 4);
            basesEarned[i] = number;
        }

        return basesEarned;
    }

    public static double getSuccessRate (int[] array){

        int successfulAtBat = 0;

        for (int element : array){
            if (element > 0){
                successfulAtBat ++;
            }
        }

        System.out.println(successfulAtBat);

        return (double) successfulAtBat;
    }

    public static double getBattingAverage(int[] array, int number){

        double battingAverage = (getSuccessRate(array) / number);

        return battingAverage;
    }
}

// Validate the user’s response to the question "Another batter?" so that the user can only enter Y, y, N, or n. If the user chooses N or n, end the program.
// Format the batting average and slugging percentages such that three decimal places are shown.