/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p774;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // JWindow frame = new JWindow();
        //JDialog frame = new JDialog();
        // JComponent frame = new JComponent() {};
        Test test = new Test();
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //  frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.MAGENTA);
      

        frame.setVisible(true);
        frame.setBounds(100, 50, 500, 400);
//
    }

}
