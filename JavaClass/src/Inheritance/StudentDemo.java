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
public class StudentDemo extends PersonDemo{
    private String dept;

    public String getDept() {
        return dept;    
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
    void show(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Department: "+getDept());
    }
    public static void main(String[] args) {
        StudentDemo s = new StudentDemo();
        s.setAge(21);
        s.setName("Arthi");
        s.setDept("CSE");
        s.show();
        
    }
}
