package AlligatorsSheep;

/**
 * Created by HKoehler on 1/20/17.
 */
public class Alligator implements Countable {

    int alligatorcount;


    @Override
    public void incrementCount() {
        alligatorcount ++;
    }

    @Override
    public void resetCount() {
        alligatorcount = 0;
    }

    @Override
    public int getCount() {
        return alligatorcount;
    }

    @Override
    public String getCountString() {
        String message = getCount() + " alligator";
        return message;
    }
}
