/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial28;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import tutorial27.PasswordSize;

/**
 *
 * @author User
 */
public class ForegroundBackgroundColor extends JFrame {
    
    private Container c;
    private JPasswordField pf;
    private Font f;
    
    ForegroundBackgroundColor() {
        initcomponet();
    }
    
    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial", Font.BOLD, 22);
        
        pf = new JPasswordField();
        pf.setBounds(50, 30, 150, 30);
        pf.setEchoChar('*');
        c.add(pf);
        
        pf.setForeground(Color.red);
        pf.setBackground(Color.black);
    }
    
    public static void main(String[] args) {
        
        ForegroundBackgroundColor frame = new ForegroundBackgroundColor();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
        frame.setTitle("JPassword Field : ");
        frame.setResizable(false);
    }
}
