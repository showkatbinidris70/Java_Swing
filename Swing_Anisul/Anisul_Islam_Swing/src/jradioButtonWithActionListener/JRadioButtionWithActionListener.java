/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jradioButtonWithActionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class JRadioButtionWithActionListener extends JFrame {

    private JRadioButton male, female;
    private Container c;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;

    JRadioButtionWithActionListener() {
        initcomponent();
    }

    public void initcomponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 50, 400, 300);

        f = new Font("Arial", Font.BOLD, 20);

        c = this.getContentPane();
        c.setLayout(null);
        JRadioButton male = new JRadioButton("Male");
        male.setFont(f);
        male.setSelected(true);
        male.setBounds(50, 100, 100, 30);
        c.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(f);
        female.setBounds(150, 100, 100, 30);
        female.setEnabled(true);
        c.add(female);

        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);

        ta = new JTextArea();
        ta.setBounds(50, 150, 220, 100);
        c.add(ta);
        ta.setFont(f);
        ta.setBackground(Color.pink);

        Handler handler = new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            if (e.getSource() == male) {
//                ta.setText("You have selected male");
//            } else {
//                ta.setText("You have selected female");
//            }

            if (e.getSource() == male) {
                ta.append("You have selected male");
            } else {
                ta.append("You have selected female");
            }
        }

    }

    public static void main(String[] args) {
        JRadioButtionWithActionListener rb = new JRadioButtionWithActionListener();
        rb.setVisible(true);

    }

}
