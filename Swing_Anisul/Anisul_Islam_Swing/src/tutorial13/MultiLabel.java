/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial13;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class MultiLabel extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel userLabel, useLabelPass;

    MultiLabel() {
        initComponents();
    }

    public void initComponents() {
        icon = new ImageIcon(getClass().getResource("screen2.JPG"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setBackground(Color.lightGray);
        c.setLayout(null);

        userLabel = new JLabel();
        userLabel.setText("Enter your name  : ");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel);

        useLabelPass = new JLabel("Enter your passWord   : ");
        useLabelPass.setBounds(50, 60, 150, 30);
        c.add(useLabelPass);
    }

    public static void main(String[] args) {
        MultiLabel frame = new MultiLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
        frame.setResizable(false);
        frame.setTitle("Set multiple Label: ");
    }
}
