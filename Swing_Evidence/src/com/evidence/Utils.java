/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evidence;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author User
 */
public class Utils {

    public static void writeTofile(String filename, List<Student> student) {

        File destFile = new File(filename + ".txt");

        try {

            if (destFile.exists() == false) {
                System.out.println("We had to make a new file");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for(Student s : students){
            out.append(s.getId()+ ", " + s.getName() + ", " + s.getAge() + ", "+ s.getEmail()+ ", " + s.getGender()+ ", "+ s.getCc() + ", "+ s.getRound() + ", " + s.getMsg()+ "\n");
            
            
            }
            
            out.close();

        } catch (Exception e) {

        }
        

    }

}
