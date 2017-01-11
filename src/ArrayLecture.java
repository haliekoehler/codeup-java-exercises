import java.util.Arrays;

/**
 * Created by HKoehler on 1/11/17.
 */
public class ArrayLecture {

    public static void main(String[] args) {

        //Creating an arry /printing array

        int [] testArray;
        testArray = new int[8];

        for (int i = 0; i <testArray.length; i++){
            System.out.print(testArray[i] + "|");
        }


        // Assign values

        System.out.println("");
        testArray[1] = 7;

        for (int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + "|");
        }


        // Array class
            // Create new class ArraysTest
            // import java.util.Arrays


        // Arrays.toString(arrayName)

        String[] animals = {"dog", "cat", "pig", "cow"};

        System.out.println(Arrays.toString(animals));


        // Arrays.fill(arrayName, value) method

        char [] grades = new char [5];
        Arrays.fill(grades, 0, 2, 'A');
        System.out.println(Arrays.toString(grades));


        // Arrays.equals(array1, array2) method

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 4, 3};

        System.out.println(Arrays.equals(array1, array2));

        //Arrays.copyOf(array, length) method
        //Arrays.copyOfRange(array, startIndex, toIndex) method

        String[] foodJustinLikes = {"hamburger", "pie", "potatoes", "kale", "peanut butter"};
        String[] foodPamLikes = Arrays.copyOf(foodJustinLikes, 3);
        String [] foodPamLikesRange = Arrays.copyOfRange(foodJustinLikes, 1, 3);
        System.out.println(Arrays.toString(foodPamLikes));

        //Arrays.sort(array, startIndex, toIndex) method

        String[] students = {"Ron", "John", "Kevin", "Jeff", "Mittsy"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //Arrays.binarySearch(array, value) method

        String[] hayStack = new String[100];
        Arrays.fill(hayStack, 0, 50, "hay");
        Arrays.fill(hayStack, 50, 100, "wheat");

        hayStack[87] = "needle";
        System.out.println(Arrays.toString(hayStack));

        Arrays.sort(hayStack);

        int index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        //Array referencing and initializing multiple arrays from a variable name

        String[] topBondFilms = new String[10];
        topBondFilms[8] = "Quantum of Solace";
        System.out.println(Arrays.toString(topBondFilms));

        topBondFilms = new String[3];

        System.out.println(Arrays.toString(topBondFilms));

        // Two-dimensional arrays

        int [][] spreadSheet = new int[6][6];

            // nested for loop to print 2d arrays
            for (int i = 0; i < spreadSheet.length; i++){
                System.out.println(""); // print each child array on new line
                for (int j = 0; j < spreadSheet[i].length; j++){
                    System.out.print(spreadSheet[i][j] + "  ");
                }
            }

        // Rectangle and Jagged arrays

        int [][] jaggedArray = new int[5][];

        int[] row1 = new int[3];
        int[] row2 = new int[10];
        int[] row3 = new int[5];
        int[] row4 = new int[7];
        int[] row5 = new int[2];

        jaggedArray[0] = row1;
        jaggedArray[1] = row2;
        jaggedArray[2] = row3;
        jaggedArray[3] = row4;
        jaggedArray[4] = row5;

        System.out.println("");
        for (int[] singleArray : jaggedArray) {
            System.out.println(Arrays.toString(singleArray));
        }
    }

}
