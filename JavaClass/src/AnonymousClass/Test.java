/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnonymousClass;

/**
 *
 * @author Hp
 */
public class Test {
    public static void main(String[] args) {
        Person ob = new Person(){
            @Override
            void display(){
                System.out.println("I am from Test");
            }
        };
        ob.display();
    }
}
