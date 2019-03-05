/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial21;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class SetForegroundAndBackground extends JFrame {
    
    private Container c;
    private JTextField tf1, tf2;
    private Font f;
    
    SetForegroundAndBackground() {
        initComponent();
        
    }
    
    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);
        
        tf1 = new JTextField("Showkat");
        tf1.setBounds(50, 50, 200, 50);
        tf1.setForeground(Color.MAGENTA);
        tf1.setBackground(Color.red);
        tf1.setFont(f);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(50, 110, 200, 50);
        tf2.setForeground(Color.red);
        tf2.setBackground(Color.BLUE);
        tf2.setFont(f);
        tf2.setText("Entey your password");
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
        
        SetForegroundAndBackground frame = new SetForegroundAndBackground();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 700, 600);
        frame.setTitle("How to create JTextField  : ");
        frame.setResizable(false);
    }
}
