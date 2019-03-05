/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_fileWriter;

import java.io.FileReader;

/**
 *
 * @author User
 */
public class FileReaderExample {

//    public static void main(String args[]) throws Exception {
//        FileReader fr = new FileReader("F:\\Advance_Java_Swing\\javaTpoint_Swing\\testout.txt");
//        int i;
//        while ((i = fr.read()) != -1) {
//            System.out.print((char) i);
//        }
//        fr.close();
//    }
    public static void main(String args[]) throws Exception {
        //  FileReader fr=new FileReader("F:\\Advance_Java_Swing\\javaTpoint_Swing\\testoutput.txt", true);  
        FileReader fr = new FileReader("F:\\Advance_Java_Swing\\javaTpoint_Swing\\testoutput.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
