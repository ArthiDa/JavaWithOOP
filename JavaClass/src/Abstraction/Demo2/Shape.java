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
public abstract class Shape {
    
    double dim1,dim2;
    
    Shape(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    abstract void area();
}
