/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author ARTHI
 */
public class Student extends Person{
    String dept;
    
    @Override
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+dept);
    }
    
    public static void main(String[] args) {
        Person p  = new Person();
        Student s = new Student();
        s.age = 21;
        s.name = "Arthi";
        s.dept = "CSE";
        s.show();
        
        p.age = 21;
        p.name = "Pritam";
        p.show();
    }
    
}
