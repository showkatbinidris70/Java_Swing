/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderb.form.newpackage;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public boolean chckEmail(String email) {
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2 && dotpos < email.length()) {
            return true;
        } else {
            return false;
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2Name = new javax.swing.JTextField();
        jTextField1Age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1Male = new javax.swing.JRadioButton();
        jRadioButton2Female = new javax.swing.JRadioButton();
        jCheckBox1Java = new javax.swing.JCheckBox();
        jCheckBox2CSS = new javax.swing.JCheckBox();
        jCheckBox3Php = new javax.swing.JCheckBox();
        jComboBox1Round = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1Comments = new javax.swing.JTextArea();
        jButton1ClearTable = new javax.swing.JButton();
        jButton2Add = new javax.swing.JButton();
        jButton3ClearForm = new javax.swing.JButton();
        jButton4ReadFromFile = new javax.swing.JButton();
        jButton5Exit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jTextField1Id.setText("0");

        jLabel2.setText("Name");

        jTextField1Age.setText("0");

        jLabel3.setText("Age");

        jLabel4.setText("Email");

        jLabel5.setText("Comments");

        jLabel6.setText("Gender");

        jLabel7.setText("Course");

        jLabel8.setText("Round");

        jRadioButton1Male.setText("Male");

        jRadioButton2Female.setText("Female");

        jCheckBox1Java.setText("Java");

        jCheckBox2CSS.setText("CSS");

        jCheckBox3Php.setText("Php");

        jComboBox1Round.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your round", "Round-41", "Round-42", "Round-43" }));

        jTextArea1Comments.setColumns(20);
        jTextArea1Comments.setRows(5);
        jScrollPane2.setViewportView(jTextArea1Comments);

        jButton1ClearTable.setText("Clear Table");
        jButton1ClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ClearTableActionPerformed(evt);
            }
        });

        jButton2Add.setText("Add");
        jButton2Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AddActionPerformed(evt);
            }
        });

        jButton3ClearForm.setText("Clear Form");
        jButton3ClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ClearFormActionPerformed(evt);
            }
        });

        jButton4ReadFromFile.setText("Read From File");
        jButton4ReadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ReadFromFileActionPerformed(evt);
            }
        });

        jButton5Exit.setText("Exit");
        jButton5Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ExitActionPerformed(evt);
            }
        });

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Email", "Gender", "Course", "Round", "Comments"
            }
        ));
        jScrollPane4.setViewportView(tableDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1Age, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4Email, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(181, 181, 181)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1Round, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4ReadFromFile)
                                .addGap(127, 127, 127)
                                .addComponent(jButton5Exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 529, Short.MAX_VALUE)
                                            .addComponent(jButton1ClearTable)
                                            .addGap(137, 137, 137)
                                            .addComponent(jButton3ClearForm))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1Java)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton2Female)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox2CSS)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBox3Php)))))))
                        .addGap(356, 356, 356))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1Male))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2Add)
                                .addGap(460, 460, 460))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1Age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1Male)
                                    .addComponent(jRadioButton2Female)))
                            .addComponent(jTextField4Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton2Add)
                                .addGap(23, 23, 23)
                                .addComponent(jButton3ClearForm)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox1Java)
                                    .addComponent(jCheckBox2CSS)
                                    .addComponent(jCheckBox3Php)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jButton1ClearTable)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1Round, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5Exit)
                                    .addComponent(jButton4ReadFromFile))))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ClearTableActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tableDisplay.getModel();
        model.setRowCount(0);


    }//GEN-LAST:event_jButton1ClearTableActionPerformed

    private void jButton2AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AddActionPerformed
        // TODO add your handling code here:

        if (jTextField1Id.getText().trim().length() < 4) {
            JOptionPane.showMessageDialog(null, "Enter at least 4 disits");
        } else if (jTextField2Name.getText().trim().length() < 3) {
            JOptionPane.showMessageDialog(null, "Enter at least 3 characters");
        } else if (Integer.parseInt(jTextField1Age.getText()) < 18 || Integer.parseInt(jTextField1Age.getText()) > 30) {
            JOptionPane.showMessageDialog(null, "Enter between 18 to 30 years");
        } else if (!chckEmail(jTextField4Email.getText().trim()) || jTextField4Email.getText().trim().length() < 1) {

            JOptionPane.showMessageDialog(null, "Enter valid email");
        } else if (jRadioButton1Male.isSelected() == false && jRadioButton2Female.isSelected() == false) {

            JOptionPane.showMessageDialog(null, "Select your gender");
        } else if (!jCheckBox1Java.isSelected() && !jCheckBox2CSS.isSelected() && !jCheckBox3Php.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select your course");
        } else if (jComboBox1Round.getItemAt(jComboBox1Round.getSelectedIndex()).equalsIgnoreCase("Select your round")) {
            JOptionPane.showMessageDialog(null, "Select your round");
        } else if (jTextArea1Comments.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "Enter at least 10 characters");
        } else {

            int id = Integer.parseInt(jTextField1Id.getText());
            String name = jTextField2Name.getText();
            int age = Integer.parseInt(jTextField1Age.getText());
            String email = jTextField4Email.getText();
            String gender = " ";
            if (jRadioButton1Male.isSelected()) {
                gender = jRadioButton1Male.getText();
            }
            if (jRadioButton2Female.isSelected()) {
                gender = jRadioButton2Female.getText();
            }
            String course = " ";
            if (jCheckBox1Java.isSelected()) {
                course += jCheckBox1Java.getText();
            }
            if (jCheckBox2CSS.isSelected()) {
                course += jCheckBox2CSS.getText();
            }
            if (jCheckBox3Php.isSelected()) {
                course += jCheckBox3Php.getText();
            }
            String round = jComboBox1Round.getItemAt(jComboBox1Round.getSelectedIndex());
            String comments = jTextArea1Comments.getText();

            DefaultTableModel model = (DefaultTableModel) tableDisplay.getModel();
            Object[] row = new Object[8];
            row[0] = id;
            row[1] = name;
            row[2] = age;
            row[3] = email;
            row[4] = gender;
            row[5] = course;
            row[6] = round;
            row[7] = comments;
            model.addRow(row);

            List<Student> student = new ArrayList<>();
            student.add(new Student(id, name, age, email, gender, course, round, comments));
            Utils.writeToFile("Kashem", student);
        }
    }//GEN-LAST:event_jButton2AddActionPerformed

    private void jButton3ClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ClearFormActionPerformed
        // TODO add your handling code here:
        jTextField1Id.setText("0");
        jTextField2Name.setText("");
        jTextField1Age.setText("0");
        jTextField4Email.setText("");
        buttonGroup1.clearSelection();
        jCheckBox1Java.setSelected(false);
        jCheckBox2CSS.setSelected(false);
        jCheckBox3Php.setSelected(false);
        jComboBox1Round.setSelectedIndex(0);
        jTextArea1Comments.setText("");
    }//GEN-LAST:event_jButton3ClearFormActionPerformed

    private void jButton4ReadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ReadFromFileActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableDisplay.getModel();
        model.setRowCount(0);
        Utils.displayStudentDataFromFile("Kashem", model);

    }//GEN-LAST:event_jButton4ReadFromFileActionPerformed

    private void jButton5ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ExitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButton5ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1ClearTable;
    private javax.swing.JButton jButton2Add;
    private javax.swing.JButton jButton3ClearForm;
    private javax.swing.JButton jButton4ReadFromFile;
    private javax.swing.JButton jButton5Exit;
    private javax.swing.JCheckBox jCheckBox1Java;
    private javax.swing.JCheckBox jCheckBox2CSS;
    private javax.swing.JCheckBox jCheckBox3Php;
    private javax.swing.JComboBox<String> jComboBox1Round;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1Male;
    private javax.swing.JRadioButton jRadioButton2Female;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea1Comments;
    private javax.swing.JTextField jTextField1Age;
    private javax.swing.JTextField jTextField1Id;
    private javax.swing.JTextField jTextField2Name;
    private javax.swing.JTextField jTextField4Email;
    private javax.swing.JTable tableDisplay;
    // End of variables declaration//GEN-END:variables
}
