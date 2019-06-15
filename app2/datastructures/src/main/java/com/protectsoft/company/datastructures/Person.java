/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protectsoft.company.datastructures;

/**
 *
 * @author piper
 */
public class Person {
    
    public String name;
    
    public Person() {}
    
    public Person(String n) {
        this.name = n;
    }
    
    @Override
    public String toString() {
        return "name:"+name;
    }
    
}
