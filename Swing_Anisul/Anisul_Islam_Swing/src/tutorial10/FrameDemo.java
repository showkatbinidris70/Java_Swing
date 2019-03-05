/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial10;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDemo extends JFrame {

    public ImageIcon icon;

    FrameDemo() {
        initComponents();

    }

    public void initComponents() {
        icon = new ImageIcon(getClass().getResource("screen2.JPG"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();
        //  JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 400);
        frame.setTitle("This is FrameDemo");
        frame.setResizable(false);
    }
}
