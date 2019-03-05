package tutorial15;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ForegroundAndBackgroundColor extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel, userPass;
    private Font f;
    
    private ForegroundAndBackgroundColor() {
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
        userLabel.setBounds(50, 50, 200, 30);
        
        c.add(userLabel);
        
        userPass = new JLabel("Enter your password   : ");
        userPass.setFont(f);
        userPass.setForeground(Color.CYAN);
        userPass.setOpaque(true);
        userPass.setBackground(Color.BLACK);
        userPass.setBounds(50, 90, 300, 30);
        c.add(userPass);
        
    }
    
    public static void main(String[] args) {
        ForegroundAndBackgroundColor frame = new ForegroundAndBackgroundColor();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("How to set Foreground and background color of JLabel   : ");
        frame.setResizable(false);
        frame.setBounds(50, 30, 400, 500);
    }
}
