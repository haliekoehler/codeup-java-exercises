import java.util.Random;

/**
 * Created by HKoehler on 1/19/17.
 */
public class CPUPlayerRock extends CPUPlayer {

    public CPUPlayerRock(String name) {
        super(name);
    }

    public Roshambo randomRoshambo (){
        return Roshambo.ROCK;
    }
}
