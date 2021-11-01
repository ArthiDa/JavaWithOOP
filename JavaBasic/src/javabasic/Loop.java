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
public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f=0;
        int s=1;
        int fibo;
        System.out.print(f+" "+s);
        for (int i = 3; i <= n; i++) {
            fibo= f+s;
            System.out.print(" "+fibo);
            f=s;
            s=fibo;
        }
        System.out.println();
        
    }
    
}
