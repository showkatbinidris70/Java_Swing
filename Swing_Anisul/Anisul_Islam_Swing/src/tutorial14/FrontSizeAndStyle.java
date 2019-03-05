/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial14;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class FrontSizeAndStyle extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;
    private JLabel userpass;
    private Font f;
    
    FrontSizeAndStyle() {
        initComponents();
    }
    
    public void initComponents() {
        icon = new ImageIcon(getClass().getResource("screen2.JPG"));
        this.setIconImage(icon.getImage());
        
        c = this.getContentPane();
        c.setBackground(Color.magenta);
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD, 14);
        
        userLabel = new JLabel();
        userLabel.setText("Enter your name  :");
        userLabel.setFont(f);
        userLabel.setBounds(50, 50, 150, 30);
        c.add(userLabel);
        
        userpass = new JLabel();
        userpass.setText("Enter your pass    :");
        userpass.setFont(f);
        userpass.setBounds(50, 90, 150, 30);
        c.add(userpass);
    }
    
    public static void main(String[] args) {
        FrontSizeAndStyle frame = new FrontSizeAndStyle();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
        frame.setResizable(false);
        frame.setTitle("How to set Front Style & Size   : ");
        
    }
}
