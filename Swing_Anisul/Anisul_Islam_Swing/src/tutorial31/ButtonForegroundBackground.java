/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial31;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import tutorial29.Button;

/**
 *
 * @author User
 */
public class ButtonForegroundBackground extends JFrame {

    private Container c;
    private JButton button1, button2;

    ButtonForegroundBackground() {
        initcomponet();
    }

    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        button1 = new JButton("Submit");
        button1.setBounds(100, 20, 80, 30);
        button1.setForeground(Color.red);
        button1.setBackground(Color.black);
        c.add(button1);

        button2 = new JButton("Clear");
        button2.setBounds(100, 60, 80, 30);
        button2.setForeground(Color.red);
        button2.setBackground(Color.black);
        c.add(button2);
    }

    public static void main(String[] args) {

        ButtonForegroundBackground frame = new ButtonForegroundBackground();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button : ");
        frame.setResizable(false);
    }
}
