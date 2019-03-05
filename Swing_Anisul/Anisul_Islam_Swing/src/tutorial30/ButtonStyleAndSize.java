/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial30;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class ButtonStyleAndSize extends JFrame {

    private Container c;
    private JButton button1, button2;
    private Font f;

    ButtonStyleAndSize() {
        initcomponent();
    }

    public void initcomponent() {
        c = this.getContentPane();
        c.setLayout(null);

        button1 = new JButton("Submit");
        button1.setBounds(100, 40, 100, 30);
        f = new Font("Arial", Font.BOLD, 18);
        button1.setFont(f);

        c.add(button1);

        button2 = new JButton("Submit");
        button2.setBounds(100, 80, 100, 30);
        f = new Font("Arial", Font.BOLD, 18);
        button2.setFont(f);
        c.add(button2);

    }

    public static void main(String[] args) {
        ButtonStyleAndSize frame = new ButtonStyleAndSize();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setBackground(Color.CYAN);
        frame.setResizable(false);
        frame.setTitle("Set button whth style & size: ");

    }
}
