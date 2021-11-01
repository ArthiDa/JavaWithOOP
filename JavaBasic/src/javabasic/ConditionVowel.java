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
public class ConditionVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch = input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.printf("%c is vowel\n",ch);
        }
        else
            System.out.printf("%c is not vowel\n",ch);
    }
    
}
