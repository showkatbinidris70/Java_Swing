/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial16;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import tutorial15.ForegroundAndBackgroundColor;

/**
 *
 * @author User
 */
public class Tips extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel, userPass;
    private Font f;
    
    private Tips() {
        initcomponent();
        
    }
    
    public void initcomponent() {
        ImageIcon icon = new ImageIcon();
        icon = new ImageIcon(getClass().getResource("screen2.JPG"));
        this.setIconImage(icon.getImage());
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        f = new Font("Arial", Font.ITALIC, 20);
        
        userLabel = new JLabel();
        userLabel.setText("Enter your name   :");
        userLabel.setFont(f);
        userLabel.setForeground(Color.red);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.DARK_GRAY);
        userLabel.setToolTipText("I am Showkat  : ");
        userLabel.setBounds(50, 50, 200, 30);    
        c.add(userLabel);
        
      //  System.out.println(" " + userLabel.getText());
        
        userPass = new JLabel("Enter your password   : ");
        userPass.setFont(f);
        userPass.setForeground(Color.CYAN);
        userPass.setOpaque(true);
        userPass.setBackground(Color.BLACK);
        userPass.setBounds(50, 90, 300, 30);
        c.add(userPass);
        
//        String s = userPass.getToolTipText();
//        System.out.println(" "+ s);
        
    }
    
    public static void main(String[] args) {
        Tips frame = new Tips();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("How to set Foreground and background color of JLabel   : ");
        frame.setResizable(false);
        frame.setBounds(50, 30, 400, 500);
    }
}
