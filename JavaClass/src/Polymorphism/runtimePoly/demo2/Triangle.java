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
public class Triangle extends Shape{
    
    double base,height;
    
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area(){
        System.out.print("Area of Triangle: ");
        return .5*base*height;
    }
}
