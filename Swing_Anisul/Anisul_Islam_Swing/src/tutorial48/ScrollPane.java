/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial48;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import tutorial47.LineWrapping;

/**
 *
 * @author User
 */
public class ScrollPane extends JFrame {

    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;

    ScrollPane() {
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
//        ta.setBounds(50, 50, 300, 200);
//        c.add(ta);

        // scroll = new JScrollPane();
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        scroll.setBounds(50, 50, 300, 200);
        c.add(scroll);

    }

    public static void main(String[] args) {
        ScrollPane frame = new ScrollPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(50, 20, 500, 400);
        frame.setResizable(false);
        frame.setTitle("TextArea");
    }
}
