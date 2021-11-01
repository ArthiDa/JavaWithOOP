/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproblems;

import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class MaxSubsequence {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in); 
            int n=input.nextInt(),c=0;
            input.nextLine();
            String s=input.nextLine();
            for(int i=0; i<n-1; i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    c++;
                }
                //System.out.println(c2);
            }
            System.out.println(c+1);
            
    }
    
}
