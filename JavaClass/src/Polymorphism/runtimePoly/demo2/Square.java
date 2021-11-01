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
public class Square extends Shape{
    double len;
    
    Square(double len){
        this.len = len; 
    }
    
    @Override
    double area(){
        System.out.print("Area of Square: ");
        return len*len;
    }
}
