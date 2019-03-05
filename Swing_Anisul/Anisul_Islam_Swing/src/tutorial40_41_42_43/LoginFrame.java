package tutorial40_41_42_43;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    private JTextField tf;
    private JLabel userLabel, passLabel;
    private JPasswordField pf;
    private JButton submitButton, clearButton;
    private Container c;
    private Font f;

    private LoginFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(50, 20, 500, 400);
        this.setTitle("How to create a login Frame :");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.BOLD, 18);

        userLabel = new JLabel("User Name : ");
        userLabel.setFont(f);
        userLabel.setBounds(50, 20, 150, 30);
        c.add(userLabel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(150, 20, 200, 30);
        c.add(tf);

        passLabel = new JLabel("Enter password : ");
        passLabel.setFont(f);
        passLabel.setBounds(50, 70, 400, 30);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setFont(f);
        pf.setEchoChar('*');
        pf.setBounds(200, 75, 200, 30);
        c.add(pf);

        submitButton = new JButton("Login");
        submitButton.setBounds(200, 200, 100, 30);
        submitButton.setFont(f);
        c.add(submitButton);

        clearButton = new JButton("Clean");
        clearButton.setBounds(320, 200, 100, 30);
        clearButton.setFont(f);
        c.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }

        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = tf.getText();
                String password = pf.getText();

                if (userName.equals("Showkat") && password.equals("123")) {
                    JOptionPane.showInputDialog(null, "you are successfully login");

                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showConfirmDialog(null, "Invalid userName or password");
                }
            }

        });

    }

    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);

    }
}
