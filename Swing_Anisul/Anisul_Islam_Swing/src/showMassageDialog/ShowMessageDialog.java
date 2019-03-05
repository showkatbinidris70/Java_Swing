package showMassageDialog;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ShowMessageDialog {

    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Enter your password");//2 parameters
        //set of incon
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", JOptionPane.ERROR);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", JOptionPane.QUESTION_MESSAGE);

        // We can use icon value for PLAIN_MESSAGE = -1, ERROR = 0,INFORMATION_MESSAGE=1,WARNING_MESSAGE=2,QUESTION_MESSAGE=3
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", -1);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", 0);
         JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", 1);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", 2);
        // JOptionPane.showMessageDialog(null, "Enter your password", "Password Field", 3);
      
      

    }

}
