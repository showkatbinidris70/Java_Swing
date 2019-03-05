/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial25;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tutorial23.ActionLister;

/**
 *
 * @author User
 */
public class AddListenerAdvance extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    AddListenerAdvance() {
        initComponent();

    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);

        tf1 = new JTextField();
        // tf1.setText("Shokat");
        tf1.setBounds(50, 50, 200, 50);
        tf1.setForeground(Color.MAGENTA);
        tf1.setBackground(Color.red);
        // tf1.setHorizontalAlignment(JTextField.RIGHT);
        tf1.setFont(f);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 200, 50);
        tf2.setForeground(Color.red);
        tf2.setBackground(Color.BLUE);
        // tf2.setHorizontalAlignment(JTextField.RIGHT);
        tf2.setFont(f);
        // tf2.setText("Entey your password");
        c.add(tf2);

        Handaler handaler = new Handaler();
        tf1.addActionListener(handaler);
        tf2.addActionListener(handaler);

    }

    class Handaler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, " Please enter something :");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }
            } else {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, " Please enter something :");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 = " + s);
                }
            }
            String s = tf2.getText();
            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, " Please enter something :");
            } else {
                JOptionPane.showMessageDialog(null, "tf1 = " + s);
            }
        }

    }

    public static void main(String[] args) {

        AddListenerAdvance frame = new AddListenerAdvance();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 700, 600);
        frame.setTitle("Action listner  : ");
        frame.setResizable(false);
    }
}
