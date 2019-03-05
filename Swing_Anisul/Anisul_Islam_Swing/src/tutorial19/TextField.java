/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial19;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    TextField() {
        initComponent();

    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        tf1 = new JTextField("Showkat");
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 200, 50);
        tf2.setText("Entey your password");
        c.add(tf2);

    }

    public static void main(String[] args) {
        TextField frame = new TextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 700, 600);
        frame.setTitle("How to create JTextField  : ");
        frame.setResizable(false);
    }
}
