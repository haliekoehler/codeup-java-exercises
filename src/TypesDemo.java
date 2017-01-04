/**
 * Created by HKoehler on 1/3/17.
 */
public class TypesDemo {
    public static void main(String[] args) {

        // TODO: create variables of every primitive type and print them to the console
        // TODO: try to assign a character to a variable that has been declared as an int
        // TODO: try to define a variable with the name class
        // TODO: initialize a variable, but do not assign it a value, then try and print it to the console

        byte testByte = 4;
        System.out.println(testByte);

        short testShort = -4000;
        System.out.println(testShort);

        int testInt = 666666;
        System.out.println(testInt);

        // need to add 'L' to end of long to reassure you DO mean "long"
        long testLong = 9223358072304902384L;
        System.out.println(testLong);

        // need to add 'F' to end of floats for same reason as above
        float testFloat = 2.34F;
        System.out.println(testFloat);

        // will print out 4.everythingelse
        double testDouble = 4239494939234994930293042345.3022345902934029343942934234;
        System.out.println(testDouble);

        char testChar = 'F';
        System.out.println(testChar);

        boolean testBoolean = true;
        System.out.println(testBoolean);

        // trying to assign char to int --- prints out a whole number
        int testCharInt = 't';
        System.out.println(testCharInt);

        // naming a variable 'class' does not work.
        // cannot print variable that does not have a value



        // Soooo, what happens with adding to max long value?

        long maxLong = Long.MAX_VALUE;
        long maxLongPlusOne = maxLong + 1;
        long maxLongPlusTwo = maxLong + 2;

        System.out.println("The largest long value: " + maxLong);
        System.out.println("The largest long value + 1: " + maxLongPlusOne);
        System.out.println("The largest long value + 2: " + maxLongPlusTwo);


    }
}
