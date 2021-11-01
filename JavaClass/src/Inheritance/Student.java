/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ARTHI
 */
public class Student extends Person {
    String dept;
    
    void showinfo2(){
        showinfo();
        System.out.println("Dept: "+dept);
    }
    
    public static void main(String[] args) {
        Student ob1 = new Student();//It has all variable and method of Person Class
        ob1.name = "Arthi";
        ob1.age = 21;
        ob1.dept = "CSE";
        ob1.showinfo2();
    }
    
}
