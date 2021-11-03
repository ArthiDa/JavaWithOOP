/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction.Demo1;

/**
 *
 * @author Hp
 */
public class Test {
    
    public static void main(String[] args) {
       /* MobileUser m = new MobileUser(); */
        //We can't create object of abstract class
        //We can only create reference variable of abstract class
        
        MobileUser m;
        
        m = new Rahim();
        m.call();
        m.sendMessage();
        
        m = new Karim();
        m.call();
        m.sendMessage();
    }
    
}