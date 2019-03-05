
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class HowToCreateRadioButton extends JFrame {
    
    private JRadioButton male, female;
    private Container c;
    private ButtonGroup grp;
    private Font p;
    
    HowToCreateRadioButton() {
        initcomponent();
    }
    
    public void initcomponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 50, 400, 300);
        
        p = new Font("Arial", Font.BOLD, 20);
        
        c = this.getContentPane();
        c.setLayout(null);
        JRadioButton male = new JRadioButton("Male");
        male.setFont(p);
        male.setSelected(true);
        male.setBounds(50, 100, 100, 30);
        c.add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setFont(p);
        female.setBounds(150, 100, 100, 30);
        female.setEnabled(true);
        c.add(female);
        
        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);
        
    }
    
    public static void main(String[] args) {
        HowToCreateRadioButton rb = new HowToCreateRadioButton();
        rb.setVisible(true);
        
    }
    
}
