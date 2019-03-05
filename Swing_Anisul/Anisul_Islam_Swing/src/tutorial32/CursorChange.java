/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial32;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import tutorial31.ButtonForegroundBackground;

/**
 *
 * @author User
 */
public class CursorChange extends JFrame {

    private Container c;
    private JButton button1, button2;
    private Cursor cur;

    CursorChange() {
        initcomponet();
    }

    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        cur = new Cursor(Cursor.HAND_CURSOR);

        button1 = new JButton("Submit");
        button1.setBounds(100, 20, 80, 30);
        button1.setForeground(Color.red);
        button1.setCursor(cur);
        button1.setBackground(Color.black);
        c.add(button1);

        button2 = new JButton("Clear");
        button2.setBounds(100, 60, 80, 30);
        button2.setForeground(Color.red);
        button2.setCursor(cur);
        button2.setBackground(Color.black);
        c.add(button2);

    }

    public static void main(String[] args) {

        CursorChange frame = new CursorChange();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button : ");
        frame.setResizable(false);
    }
}
