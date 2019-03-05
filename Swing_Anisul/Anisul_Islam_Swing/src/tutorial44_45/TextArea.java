/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial44_45;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class TextArea extends JFrame {

    private Container c;
    private JTextArea ta;
    private Font f;

    TextArea() {
        initComponents();

    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.ITALIC, 15);

        ta = new JTextArea();
        ta.setFont(f);
        ta.setBounds(50, 50, 300, 200);
        c.add(ta);

    }

    public static void main(String[] args) {
        TextArea frame = new TextArea();
        frame.setVisible(true);
        frame.setBounds(50, 20, 500, 400);
        frame.setResizable(false);
        frame.setTitle("TextArea");
    }
}
