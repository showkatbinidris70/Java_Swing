/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication37 {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long x = sc.nextLong();

        for (int i = 0; i < t; i++) {

            try {
               // long x = sc.nextLong();
               // System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println(x + "* byte");
                }
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

}
