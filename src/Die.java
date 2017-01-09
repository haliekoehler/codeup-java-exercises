/**
 * Created by HKoehler on 1/9/17.
 */
public class Die {

    int numberOfSides;

    public Die (int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int getRandomNumber (int numberOfSides){
        int max = numberOfSides;
        int random = (int)(Math.random() * max + 1);
        return random;
    }
}
