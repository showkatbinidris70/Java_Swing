/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.first.example;

import com.sun.glass.ui.Cursor;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FirstSwingExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setResizable(true);
       frame.setLayout(null);
     

        button.setBounds(150, 130, 100, 50);
        frame.add(button);
        frame.setTitle("First Swing Example");

    }

}
