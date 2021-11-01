/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism.runtimePoly.demo2;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        System.out.println("Enter the Length and Width of Rectangle: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        s[0] = new Rectangle(a,b);
        s[1] = new Triangle(5,6);
        s[2] = new Square(5);
        for(Shape x:s){
            System.out.println(x.area());
        }
    }
}
