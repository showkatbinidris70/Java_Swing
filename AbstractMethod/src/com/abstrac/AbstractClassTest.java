/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstrac;

/**
 *
 * @author User
 */
public class AbstractClassTest {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("My car");
        v.drive();
        System.out.println(v);
    }
}
