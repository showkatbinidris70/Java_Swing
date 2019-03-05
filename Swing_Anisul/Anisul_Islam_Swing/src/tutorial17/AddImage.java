/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial17;

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
public class AddImage extends JFrame {

    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;

    AddImage() {
        initComponent();

    }

    public void initComponent() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        img = new ImageIcon(getClass().getResource("PNGP.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(100, 50, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

    }

    public static void main(String[] args) {
        AddImage frame = new AddImage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 700, 600);
        frame.setTitle("How to add image on JLabel ? ");
        frame.setResizable(false);
    }
}
