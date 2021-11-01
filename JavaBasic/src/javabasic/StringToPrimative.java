/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author ARTHI
 */
public class StringToPrimative {
    public static void main(String[] args) {
        int n=32;
        String s = Integer.toString(n);
        System.out.println(s);
        
        String s2="73";
        //int i = Integer.parseInt(s2);
        //System.out.println(i);
        int i= Integer.valueOf(s2);
        System.out.println(i);
    }
    
}
