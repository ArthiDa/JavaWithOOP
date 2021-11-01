/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class ArithmaticOperator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        num1=input.nextInt();
        num2= input.nextInt();
        int result = num1 + num2;
        System.out.println("Sum = "+result);
    }
    
}
