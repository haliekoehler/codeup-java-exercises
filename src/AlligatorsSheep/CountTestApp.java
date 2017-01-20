package AlligatorsSheep;

/**
 * Created by HKoehler on 1/20/17.
 */
public class CountTestApp {

    public static void main(String[] args) throws CloneNotSupportedException {


        // create alligator
        Alligator alligator = new Alligator();

        // count alligator three times
        System.out.println("Counting Alligator...");
        CountUtil.count(alligator, 3);
        System.out.println(); // skip line

        // create sheep
        Sheep sheep = new Sheep();
        sheep.setName("Blackie");

        System.out.println("Counting Sheep...");

        // counts the first sheep 2 times
        CountUtil.count(sheep, 2);
        System.out.println(); // skip line

        // clone the first sheep, changes the name, and counts it 3 times
        sheep.resetCount();
        Sheep clone = (Sheep) sheep.clone();
        clone.setName("Dolly");
        CountUtil.count(clone, 3);
        System.out.println(); // skip line

        // counts the first sheep again 1 time
        sheep.resetCount();
        CountUtil.count(sheep, 1);



    }

}
