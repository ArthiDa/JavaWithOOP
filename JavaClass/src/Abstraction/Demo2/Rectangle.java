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
public class Rectangle extends Shape{
    Rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    
    @Override
    void area(){
        double result = dim1*dim2;
        System.out.println("Area of Rectangle : "+result);
    }
}
