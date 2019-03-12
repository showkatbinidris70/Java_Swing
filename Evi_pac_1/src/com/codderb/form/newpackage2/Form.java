/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderb.form.newpackage2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public boolean checkEmail(String email) {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Display = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2Name = new javax.swing.JTextField();
        jTextField3Age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1Male = new javax.swing.JRadioButton();
        jRadioButton2Female = new javax.swing.JRadioButton();
        jCheckBox1Java = new javax.swing.JCheckBox();
        jCheckBox2Swing = new javax.swing.JCheckBox();
        jCheckBox3Android = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1Comments = new javax.swing.JTextArea();
        jButton1Add = new javax.swing.JButton();
        jButton2ClearForm = new javax.swing.JButton();
        jButton3ClearTable = new javax.swing.JButton();
        jButton4Read = new javax.swing.JButton();
        jButton5Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ragistration Form");

        jTable1Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Email", "Gender", "Course", "Round", "Comments"
            }
        ));
        jScrollPane1.setViewportView(jTable1Display);

        jLabel2.setText("ID");

        jTextField1Id.setText("0");

        jLabel3.setText("Name");

        jTextField3Age.setText("0");

        jLabel4.setText("Age");

        jLabel5.setText("Email");

        jLabel6.setText("Gender");

        jLabel7.setText("Course");

        jLabel8.setText("Round");

        jLabel9.setText("Comments");

        buttonGroup1.add(jRadioButton1Male);
        jRadioButton1Male.setText("Male");

        buttonGroup1.add(jRadioButton2Female);
        jRadioButton2Female.setText("Female");

        jCheckBox1Java.setText("Java");

        jCheckBox2Swing.setText("Swing");

        jCheckBox3Android.setText("Android");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your round", "Round - 41", "Round -42", "Round -43" }));

        jTextArea1Comments.setColumns(20);
        jTextArea1Comments.setRows(5);
        jScrollPane2.setViewportView(jTextArea1Comments);

        jButton1Add.setText("Add");
        jButton1Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AddActionPerformed(evt);
            }
        });

        jButton2ClearForm.setText("Clear Form");
        jButton2ClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ClearFormActionPerformed(evt);
            }
        });

        jButton3ClearTable.setText("Clear Table");
        jButton3ClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ClearTableActionPerformed(evt);
            }
        });

        jButton4Read.setText("Read");
        jButton4Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ReadActionPerformed(evt);
            }
        });

        jButton5Exit.setText("Exit");
        jButton5Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField3Age, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField4Email, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1Male)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2Female))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(219, 219, 219))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jCheckBox1Java)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox2Swing)
                                        .addGap(39, 39, 39)
                                        .addComponent(jCheckBox3Android))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1Add)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton3ClearTable))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2ClearForm)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton4Read)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5Exit)))))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Add)
                            .addComponent(jButton3ClearTable))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton5Exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2ClearForm)
                                        .addComponent(jButton4Read))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3Age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1Male)
                            .addComponent(jRadioButton2Female))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Java)
                            .addComponent(jCheckBox2Swing)
                            .addComponent(jCheckBox3Android))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AddActionPerformed
        // TODO add your handling code here:
        if (jTextField1Id.getText().trim().length() < 4) {
            JOptionPane.showMessageDialog(null, " Enter at least 4 disits");
        } else if (jTextField2Name.getText().trim().length() < 3) {
            JOptionPane.showMessageDialog(null, " Enter at least 3 characters");
        } else if (Integer.parseInt(jTextField3Age.getText()) < 18 || Integer.parseInt(jTextField3Age.getText()) > 30) {
            JOptionPane.showMessageDialog(null, " Enter your age among 18 to 30");
        } else if (!checkEmail(jTextField4Email.getText()) || jTextField4Email.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, " Enter your valid email");
        } else if (jRadioButton1Male.isSelected() == false && jRadioButton2Female.isSelected() == false) {
            JOptionPane.showMessageDialog(null, " Select your gender");
        } else if (!jCheckBox1Java.isSelected() && !jCheckBox2Swing.isSelected() && !jCheckBox3Android.isSelected()) {
            JOptionPane.showMessageDialog(null, " Select your course");
        } else if (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equalsIgnoreCase("Select your round")) {
            JOptionPane.showMessageDialog(null, " Select your round");
        } else if (jTextArea1Comments.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, " Enter at least 10 characters");
        } else {

            int id = Integer.parseInt(jTextField1Id.getText());
            String name = jTextField2Name.getText();
            int age = Integer.parseInt(jTextField3Age.getText());
            String email = jTextField4Email.getText();
            String gender = " ";
            if (jRadioButton1Male.isSelected()) {
                gender = jRadioButton1Male.getText();
            }
            if (jRadioButton2Female.isSelected()) {
                gender = jRadioButton2Female.getText();
            }
            String course = " ";
            if (jCheckBox1Java.isShowing()) {
                course += jCheckBox1Java.getText();
            }
            if (jCheckBox2Swing.isShowing()) {
                course += jCheckBox2Swing.getText();
            }
            if (jCheckBox3Android.isShowing()) {
                course += jCheckBox3Android.getText();
            }
            String round = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
            String comments = jTextArea1Comments.getText();

            DefaultTableModel model = (DefaultTableModel) jTable1Display.getModel();
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

            List<Student> list = new ArrayList<>();
            list.add(new Student(id, name, age, email, gender, course, round, comments));
            Utils.writeToFile("Mobile", list);
        }
    }//GEN-LAST:event_jButton1AddActionPerformed

    private void jButton3ClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ClearTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1Display.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton3ClearTableActionPerformed

    private void jButton2ClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ClearFormActionPerformed
        // TODO add your handling code here:
        jTextField1Id.setText("0");
        jTextField2Name.setText("");
        jTextField3Age.setText("0");
        jTextField4Email.setText("");
        buttonGroup1.clearSelection();
        jCheckBox1Java.setSelected(false);
        jCheckBox2Swing.setSelected(false);
        jCheckBox3Android.setSelected(false);
        jComboBox1.setSelectedIndex(0);
        jTextArea1Comments.setText("");


    }//GEN-LAST:event_jButton2ClearFormActionPerformed

    private void jButton5ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ExitActionPerformed

    private void jButton4ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ReadActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1Display.getModel();
        model.setRowCount(0);
        Utils.sidplayStudentDataFromFile("Mobile", model);
    }//GEN-LAST:event_jButton4ReadActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1Add;
    private javax.swing.JButton jButton2ClearForm;
    private javax.swing.JButton jButton3ClearTable;
    private javax.swing.JButton jButton4Read;
    private javax.swing.JButton jButton5Exit;
    private javax.swing.JCheckBox jCheckBox1Java;
    private javax.swing.JCheckBox jCheckBox2Swing;
    private javax.swing.JCheckBox jCheckBox3Android;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1Male;
    private javax.swing.JRadioButton jRadioButton2Female;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1Display;
    private javax.swing.JTextArea jTextArea1Comments;
    private javax.swing.JTextField jTextField1Id;
    private javax.swing.JTextField jTextField2Name;
    private javax.swing.JTextField jTextField3Age;
    private javax.swing.JTextField jTextField4Email;
    // End of variables declaration//GEN-END:variables
}
