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
public abstract class Vehicle {

    private String name ;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void drive();
    
    public String getName(){
    return this.name;
    }

}
