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
public class StringDemo {
    public static void main(String[] args) {
        String s = "Pranab Barua";
        String s2 = " Arthi";
        
        
        
        System.out.println(s+" "+s2);
        System.out.println("Length of s = "+s.length());
        if(s.equals(s2))//Cann't use == cz its can't compare value
            //equalsIgnoreCase() for capital/small letter
            System.out.println("Equals");
        else 
            System.out.println("Not Equals");
        System.out.println(s.contains("Barua"));
        System.out.println(s.isEmpty());
        String name= s + s2;//s.concat(s2)
        System.out.println("Full name is "+name);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        boolean A= s.startsWith("Pra");
        System.out.println(A);
        System.out.println(s.endsWith(s2));
        
        
        
    }
    
}
