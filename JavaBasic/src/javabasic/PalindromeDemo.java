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
public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        StringBuffer sb=new StringBuffer(s);
        String s2=sb.reverse().toString();
        if(s.equals(s2))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    
}
