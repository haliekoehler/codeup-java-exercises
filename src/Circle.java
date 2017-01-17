import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by HKoehler on 1/17/17.
 */
public class Circle {

    private double radius;
    public static int numberOfCirclesCreated;

    // CONSTRUCTOR
    public Circle(double radius){
        this.radius = radius;
        numberOfCirclesCreated++;
    }

    public double getCircumference(double radius){
        return Math.PI * 2 * radius;
    }

    public String getFormattedCircumference(){
        String message = "The circumference of the circle is ";
        return message + formatNumber(getCircumference(radius));
    }

    public double getArea(double radius){
        return Math.PI * radius * radius;
    }

    public String getFormattedArea(){
        String message = "The area of the circle is ";
        return message + formatNumber(getArea(radius));
    }

    public String formatNumber(double x){
        DecimalFormat format = new DecimalFormat("#.00");
        return format.format(x);

    }

    public static int getObjectCount(){
        return numberOfCirclesCreated;
    }

}
