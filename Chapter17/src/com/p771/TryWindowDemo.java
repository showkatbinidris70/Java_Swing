/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p771;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class TryWindowDemo extends JFrame{
   TryWindowDemo(){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100, 50, 500, 400);
       setTitle("This is the window title ");
   }
    
    public static void main(String[] args) {
       TryWindowDemo frame = new TryWindowDemo();
       frame.setVisible(true);
    }
    
}
