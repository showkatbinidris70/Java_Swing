package tutorial34;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;

public class ActionListener extends JFrame {

    public Container c;
    public JTextField tf;
    public JButton button;

    ActionListener() {
        initComponent();

    }

    public void initComponent() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        tf = new JTextField();
        tf.setBounds(50, 30, 150, 30);
        c.add(tf);

        button = new JButton();
        button.setBounds(50, 70, 150, 30);
        c.add(button);
        
        button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
        
        }
        
        });

    }

    public static void main(String[] args) {

        ActionListener frame = new ActionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button : ");
        frame.setResizable(false);
    }
}
