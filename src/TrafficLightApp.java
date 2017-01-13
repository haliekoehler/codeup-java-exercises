import java.util.Scanner;

/**
 * Created by HKoehler on 1/12/17.
 */
public class TrafficLightApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userColor;

        userColor = promptUser(scan);

        TrafficLightColor lightColor = TrafficLightColor.valueOf(userColor.toUpperCase());

        makeDrivingDecision(lightColor);

    }

    public static String promptUser (Scanner scan){

        String userInput;

        System.out.println("What color is the light?");
        userInput = scan.next();

        if (userInput.equalsIgnoreCase("red") || userInput.equalsIgnoreCase("yellow") || userInput.equalsIgnoreCase("green")){
            return userInput;
        } else if (!userInput.equalsIgnoreCase("red") || !userInput.equalsIgnoreCase("yellow") || !userInput.equalsIgnoreCase("green")){
            System.out.println("That is not a traffic light color, please try again.");
            return promptUser(scan);
        }

        return userInput;
    }

    public static void makeDrivingDecision(TrafficLightColor color){
        switch(color) {
            case GREEN:
                System.out.println("GO! GO! GO!");
                break;
            case YELLOW:
                System.out.println("You should prepare to Stop...");
                break;
            case RED:
                System.out.println("You should STOP!");
                break;
        }
    }
}



