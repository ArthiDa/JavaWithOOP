/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalKey;

/**
 *
 * @author Hp
 */
public class Student extends Person{
    
    //final class can't inherited
    
    //final method can't be override
    
//    void display(){
//        System.out.println("Details of Student");
//    }
    
    void display2(){
        System.out.println("Details of Student");
    }
    
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        s1.display2();
    }
    
}
