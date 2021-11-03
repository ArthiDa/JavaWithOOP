/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction.Demo2;

/**
 *
 * @author Hp
 */
public class Circle extends Shape{
    
    Circle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        double result = Math.PI*dim1*dim2;
        System.out.println(String.format("Area of Circle : %.5f",+result));
    }
    
}
