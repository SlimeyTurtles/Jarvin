package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
w
    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("./frogs/frog.jpg");

        JLabel label = new JLabel();
        label.setText("text");
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}