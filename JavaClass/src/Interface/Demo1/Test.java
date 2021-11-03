/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Demo1;

/**
 *
 * @author Hp
 */
public class Test {
    public static void main(String[] args) {
        
        /* Animal a = new Animal */
        //Can't create object of Animal Interface
        
        Dog d = new Dog();
        d.eat();
        
        Cat c = new Cat();
        c.eat();
        
        
    }
}
