import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by HKoehler on 1/11/17.
 */

public class BattingStats {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator(scan);

        int numberOfBatters;
        int numberOfAtBats;
        int sumOfBases;
        int [][] batterArray;
        double battingAverage;
        double slugPercentage;
        int[] basesEarned;


        System.out.println("Welcome to the Batting Statistics App!");


        // Make initial Array
        batterArray = makeArray(validate);
        System.out.println(""); //skip line
        System.out.println("Your array of Batter Stats:");
        for (int [] array : batterArray){
            System.out.println(Arrays.toString(array));
        }

    }

    public static int[][] makeArray (Validator validate) {
        int numberOfBatters;
        int[][] batterArray;

        numberOfBatters = validate.getIntWithinRange("Enter number of Batters: ", 1, 100);
        System.out.println(""); // skip line
        batterArray = new int[numberOfBatters][];

        for (int i = 0; i < numberOfBatters; i++) {
            int atBats;
            int[] row;
            atBats = validate.getIntWithinRange("AT BAT --- How many 'at bats' for Batter #" + (i + 1) + "?", 1, 50);
            System.out.println(""); // skip a line
            row = new int[atBats];
            for (int j = 0; j < row.length; j++){
                int bases;
                bases = validate.getIntWithinRange(" How many bases were earned during at bat #" + (j + 1), 0, 4);
                row[j] = bases;
            }

            batterArray[i] = row;
        }

        return batterArray;
    }

//    public static int printBattingAverage (int[][] array){
//
//    }

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

        double battingAverage = ((getSuccessRate(array) / number)*100);

        return battingAverage;
    }
}


//        // Calculate Batting Average
//        battingAverage = getBattingAverage(basesEarned, numberOfAtBats);
//        System.out.println("Batting Average: " + battingAverage);
//
//
//        // Calculate Slugging Percentage
//        sumOfBases = IntStream.of(basesEarned).sum();
//        slugPercentage = (sumOfBases / numberOfAtBats);
//
//        System.out.println("Slugging Percentage: " + slugPercentage);



//* BONUS :
  //      * At the start of the program, prompt the user for the number of batters to enter,
    //    * then save the statistics in a two-dimensional array.
      //  * The program won’t have to prompt the user whether to enter data for another batter
        //* since it will know how many batters are to be entered. After all batters have been entered,
        //* print a one line summary for each batter.
        //*
        //* Instead of storing an Array of integers, create a class named AtBat
 //       * and store instances of this class in the array.
   //     * This class should define an enumeration named Result with members OUT, SINGLE, DOUBLE, TRIPLE, and HOMERUN.
     //   * The class should have a constructor that accepts a Result parameter and a method named basesEarned
 //       * that returns an int representing the number of bases earned for the at bat.