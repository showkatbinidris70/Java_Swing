/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial40_41_42_43;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class NewFrame extends JFrame {

    private JTextField tf;
    private JLabel userLabel;
    private JPasswordField pf;
    private JButton submitButton, clearButton;
    private Container c;
    private Font f;

    NewFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(50, 20, 500, 400);
        this.setTitle("How to create a login Frame :");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        userLabel = new JLabel("Hello every one !");
        userLabel.setBounds(50, 50, 200, 50);
        c.add(userLabel);

    }

    public static void main(String[] args) {
        NewFrame frame = new NewFrame();
        frame.setVisible(true);

    }
}
