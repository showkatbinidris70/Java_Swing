/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial47;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import tutorial44_45.TextArea;

/**
 *
 * @author User
 */
public class LineWrapping extends JFrame {

    private Container c;
    private JTextArea ta;
    private Font f;

    LineWrapping() {
        initComponents();

    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.ITALIC, 15);

        ta = new JTextArea();
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setBounds(50, 50, 300, 200);
        c.add(ta);

    }

    public static void main(String[] args) {
        LineWrapping frame = new LineWrapping();
        frame.setVisible(true);
        frame.setBounds(50, 20, 500, 400);
        frame.setResizable(false);
        frame.setTitle("TextArea");
    }
}
