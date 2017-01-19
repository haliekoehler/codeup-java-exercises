/**
 * Created by HKoehler on 1/18/17.
 */
public class Player {

    String name;

    // Constructor
    public Player(String name){
        this.name = name;
    }

    // Hold valid Roshambo selections
    public enum Roshambo {
        ROCK, PAPER, SCISSORS
    }

    // Generate Roshambo selection as a String
    public static String generateRoshamboString (Roshambo roshambo){
        String selection = "";

        switch(roshambo){
            case ROCK:
                selection = "ROCK";
                break;
            case PAPER:
                selection = "PAPER";
                break;
            case SCISSORS:
                selection = "SCISSORS";
                break;
            default:
                System.out.println("ERROR. Invalid input");
        }

        return selection;
    }

}
