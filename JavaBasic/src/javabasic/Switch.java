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
public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int digit;
        digit=input.nextInt();
        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:   
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Wrong Digit!!!");

        }
        int x,y;
        x=input.nextInt();
        y=input.nextInt();
        int max=x>y?x:y;
        System.out.println(""+max);
        

    }
    
}
