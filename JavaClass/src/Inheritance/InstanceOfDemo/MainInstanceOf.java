/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance.InstanceOfDemo;

/**
 *
 * @author ARTHI
 */
public class MainInstanceOf {
    
    public static void main(String[] args) { 
    InstanceOf ob = new InstanceOf();
    Ex1InstanceOf ob2 = new Ex1InstanceOf();
    Ex2InstanceOf ob3 = new Ex2InstanceOf();
    
    System.out.println(ob instanceof InstanceOf);
    System.out.println(ob2 instanceof InstanceOf);
    System.out.println(ob3 instanceof InstanceOf);
    System.out.println(ob3 instanceof Ex1InstanceOf);
    System.out.println(ob instanceof Ex2InstanceOf);
    System.out.println(ob2 instanceof Ex2InstanceOf);
    System.out.println(ob instanceof Ex1InstanceOf);




    }
}
