/**
 * Created by HKoehler on 1/9/17.
 */

public class Die {

    int numberOfSides;
    int currentValue;

    // create a die
    public Die (int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    //
    public int roll (int numberOfSides){
        currentValue = (int)(Math.random() * numberOfSides + 1);
        return currentValue;
    }
}
