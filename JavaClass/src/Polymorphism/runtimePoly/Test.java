/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism.runtimePoly;

/**
 *
 * @author Hp
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        //We can easily use parent class varible as a reference
        //variable to refer child class object 
        //this is called runtime/dynamic Polymorphism
        p = new Teacher();
        p.display();
        p = new Student();
        p.display();
    }
}
