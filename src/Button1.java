/**
 * Created by HKoehler on 1/19/17.
 */

import javax.swing.*;
import java.awt.*;
public class Button1 {

    public static void main(String[] args) {
            Button1 gui = new Button1();
            gui.go();

    }
    public void go() {
        JFrame frame = new JFrame();
        JButton east = new JButton ("Rock");
        JButton west = new JButton ("Paper");
        JButton north = new JButton ("Scissors");
        JButton south = new JButton ("New Game");
        JButton center = new JButton ("Exit");


        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.setSize(100,100);
        frame.setVisible(true);

    }

}
