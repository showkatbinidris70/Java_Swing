/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_fileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FileWriterExample {

    public static void main(String args[]) {

        //        try {
//            FileWriter fw = new FileWriter("F:\\Advance_Java_Swing\\javaTpoint_Swing\\testout.txt");
//            fw.write("Welcome to javaTpoint.");
//            fw.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Success...");
        try {
            FileWriter fw = new FileWriter("F:\\Advance_Java_Swing\\javaTpoint_Swing\\testoutput.txt", true);
            fw.write("Welcome to javaTpoint.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
