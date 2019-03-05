/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Test extends JFrame {

    Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("This is title");

    }

    public static void main(String[] args) {
        //  JFrame frame = new JFrame();
        Test frame = new Test();
        frame.setVisible(true);

    }
}
