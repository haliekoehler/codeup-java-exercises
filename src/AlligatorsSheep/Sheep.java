package AlligatorsSheep;

/**
 * Created by HKoehler on 1/20/17.
 */
public class Sheep implements Countable, Cloneable {

    String name;
    int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void incrementCount() {
        count ++;
    }

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        String message = count + " " + getName();
        return message;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
