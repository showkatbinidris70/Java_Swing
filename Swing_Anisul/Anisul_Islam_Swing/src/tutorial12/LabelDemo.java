package tutorial12;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;

    LabelDemo() {
        initComponets();
    }

    public void initComponets() {
        icon = new ImageIcon(getClass().getResource("screen2.JPG"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);

        userLabel = new JLabel();
        userLabel.setText("Enter your name: ");

        c.add(userLabel);
        userLabel.setBounds(50, 20, 100, 30);
    }

    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("How to create JLabel?");
        frame.setResizable(false);

    }
}
