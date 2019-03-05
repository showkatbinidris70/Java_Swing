
package tutorial27;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import tutorial26.Password;


public class PasswordSize extends JFrame {

    private Container c;
    private JPasswordField pf;
    private Font f;

    PasswordSize() {
        initcomponet();
    }

    public void initcomponet() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.BOLD, 22);

        pf = new JPasswordField();
        pf.setBounds(50, 30, 150, 30);
        pf.setEchoChar('*');
        c.add(pf);
    }

    public static void main(String[] args) {

        PasswordSize frame = new PasswordSize();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
        frame.setTitle("JPassword Field : ");
        frame.setResizable(false);
    }
}
