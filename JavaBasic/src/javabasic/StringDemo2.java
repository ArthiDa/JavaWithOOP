/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Arrays;

/**
 *
 * @author ARTHI
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s2 = "    Pranab Barua Arthi     ";
        System.out.println(s2);
        String s= s2.trim();
        System.out.println(s);
        char ch = s.charAt(0);
        System.out.println(ch);
        int p = s.codePointAt(0);
        System.out.println(p);
        int p2 = s.indexOf('n');
        System.out.println(p2);
        int p3 = s.lastIndexOf('a');
        System.out.println(p3);
        System.out.println(s.replace('a','$'));
        String[] s3=s.split(" ");
        System.out.println(Arrays.toString(s3));
        int cn=0;
        for(String x: s3){
            cn++;
            //System.out.println(x);
        }
        System.out.println(cn);
    }
    
}
