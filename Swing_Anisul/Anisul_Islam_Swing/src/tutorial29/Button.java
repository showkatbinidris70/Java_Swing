package tutorial29;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame {

    private Container c;
    private JButton button1, button2;

    Button() {
        initcomponet();
    }

    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        button1 = new JButton("Submit");
        button1.setBounds(100, 20, 80, 30);
        c.add(button1);

        button2 = new JButton("Clear");
        button2.setBounds(100, 60, 80, 30);
        c.add(button2);
    }

    public static void main(String[] args) {

        Button frame = new Button();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button : ");
        frame.setResizable(false);
    }
}
