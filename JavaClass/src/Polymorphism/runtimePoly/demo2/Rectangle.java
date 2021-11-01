/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism.runtimePoly.demo2;

/**
 *
 * @author Hp
 */
public class Rectangle extends Shape{
    double len,wid;
    
    Rectangle(double len,double wid){
        this.len = len;
        this.wid = wid;    
    }
    
    @Override
    double area(){
        System.out.print("Area of Rectangle: ");
        return len*wid;
    }
}
