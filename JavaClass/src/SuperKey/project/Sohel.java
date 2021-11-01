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
public class Sohel extends Person{
    double Height;
    
    Sohel(String name,int age,double Height){
        super(name,age);
        this.Height = Height;
    }
    
    @Override
    void show(){
        super.show();
        System.out.println("Height: "+Height);
    }
}
