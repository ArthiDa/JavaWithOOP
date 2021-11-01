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
public class NumberConversion {

    public static void main(String[] args) {
        //decimal to binary,octal,hexa
        int decimal1 = 15;
        String binary = Integer.toBinaryString(decimal1);
        System.out.println("Binary = "+binary);
        int decimal2 = 36;
        String octal = Integer.toOctalString(decimal2);
        System.out.println("Octal = "+octal);
        int decimal3 = 15;
        String hex = Integer.toHexString(decimal3);
        System.out.println("Hexa = "+hex);
        // binary,octal,hexa to decimal
        String bin="1111";
        Integer decimal4 = Integer.parseInt(bin, 2);
        System.out.println("Binary to Decimal = "+decimal4);
        String oct = "44";
        Integer decimal5 = Integer.parseInt(oct,8);
        System.out.println("Octal to Decimal = "+decimal5);
        String hexa = "f";
        Integer decimal6=Integer.parseInt(hexa,16);
        System.out.println("Hexa to Decimal = "+decimal6);
        //Binary to Hexa
        String b="11011111";
        Integer d=Integer.parseInt(b, 2);
        int d2=d;
        String h = Integer.toHexString(d2);
        System.out.println(h);
            
        
        
    }

}
