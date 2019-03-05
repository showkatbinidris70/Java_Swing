/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial26;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *
 * @author User
 */
public class Password extends JFrame {

    private Container c;
    private JPasswordField pf;

    Password() {
        initcomponet();
    }

    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        pf = new JPasswordField();
        pf.setBounds(50, 30, 150, 30);
        pf.setEchoChar('*');
        c.add(pf);
    }

    public static void main(String[] args) {

        Password frame = new Password();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
        frame.setTitle("Action listner  : ");
        frame.setResizable(false);
    }
}
