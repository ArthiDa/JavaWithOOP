/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKey.project;

/**
 *
 * @author ARTHI
 */
public class Pritam extends Person {
    String dept;
    
    Pritam(String name,int age,String dept){
        super(name,age);
        this.dept = dept;
    }
    @Override
    void show(){
        super.show();
        System.out.println("Department: "+dept);
    }
}
