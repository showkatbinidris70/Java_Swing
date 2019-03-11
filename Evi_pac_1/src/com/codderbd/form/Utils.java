/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderbd.form;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {

    public static void writeToFile(String fileName, List<Student> student) {
        File destFile = new File(fileName + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("you had to write a file");
                destFile.createNewFile();
            }

            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : student) {
                out.append(s.getId() + " ," + s.getName() + " ," + s.getAge() + " ," + s.getEmail() + ","
                        + s.getGender() + " ," + s.getCourse() + " ," + s.getComments() + "\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could not log");
        }
    }

    public static void displayStudentDataFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(" ,"));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffer reader issue");
        }
    }
}
