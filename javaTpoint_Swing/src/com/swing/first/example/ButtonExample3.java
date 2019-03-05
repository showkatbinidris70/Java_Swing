/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.first.example;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class ButtonExample3 {

    ButtonExample3() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("red-submit-button-md.png"));
        b.setBounds(100, 100, 150, 50);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample3();
    }
}
