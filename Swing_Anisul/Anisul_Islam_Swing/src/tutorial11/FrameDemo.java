/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial11;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FrameDemo extends JFrame {

    private ImageIcon icon;
    private Container c;

    public FrameDemo() {
        initComponent();
    }

    public void initComponent() {
        icon = new ImageIcon(getClass().getResource("screen2.JPG"));
        this.setIconImage(icon.getImage());
        c = this.getContentPane();
        c.setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();
        // JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
        frame.setTitle("This is Flash Listh");
        frame.setResizable(false);
    }
}
