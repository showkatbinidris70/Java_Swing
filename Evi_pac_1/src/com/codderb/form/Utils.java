/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderb.form;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {

    public static void writeToFile(String filename, List<Student> student) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileOutputStream(destFile, true));
            for (Student s : student) {
                out.append(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getEmail()
                   + "," + s.getGender() + "," + s.getCourse() + "," + s.getRound() + "," + s.getComments());
                
            }
            out.close();
        } catch (Exception e) {
        }

    }
    
    public static void displayStudentDataFromFile(String filename, DefaultTableModel model){
    String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename+".txt"));
            while((line = reader.readLine()) !=null){
            model.addRow(line.split(" ,"));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffer reader issue");
        }
    
    }
}
