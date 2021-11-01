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
public class WrapperClass {
    public static void main(String[] args) {
        //AutoBoxing-> Primative--->Object
        int n=25;
        Integer x=n;
        System.out.println(x);
        
        //UnBoxing-> Object--->Primative
        Character c='A';
        char ch=c;
        System.out.println(ch);
        
    }
    
}
