/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial33;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import tutorial32.CursorChange;

/**
 *
 * @author User
 */
public class SetImageOnButton extends JFrame {

    private Container c;
    private JButton button1, button2;
    private Cursor cur;
    private ImageIcon icon1, icon2;

    SetImageOnButton() {
        initcomponet();
    }

    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        cur = new Cursor(Cursor.HAND_CURSOR);

        icon1 = new ImageIcon(getClass().getResource("download (1).jpg"));
        icon2 = new ImageIcon(getClass().getResource("red-submit-button-md.png"));

        button1 = new JButton(icon1);
        button1.setBounds(100, 100, 60, 30);

        button1.setCursor(cur);

        c.add(button1);

        button2 = new JButton(icon2);
        button2.setBounds(100, 140, 60, 30);

        button2.setCursor(cur);

        c.add(button2);

    }

    public static void main(String[] args) {

        SetImageOnButton frame = new SetImageOnButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button : ");
        frame.setResizable(false);
    }
}
