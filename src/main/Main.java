package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    static JLabel l;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        JLabel label1 = new JLabel("Test");
        l = new JLabel("panel label");
        label1.setText("Label Text");
        frame.getContentPane().setBackground(Color.YELLOW);
    }

}
