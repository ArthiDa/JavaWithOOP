/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproblems;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class BigIntAddAndMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
//        int a=9999;
//        BigInteger num = BigInteger.valueOf(a);
//        System.out.println(n.add(num));
//        System.out.println(n.multiply(num));
        int x = input.nextInt();
        BigInteger n1 = BigInteger.valueOf(x);
        BigInteger res = n.remainder(n1);
        int a=0;
        BigInteger num = BigInteger.valueOf(a);
        if(res.equals(num))
            System.out.println("YES");
        else
            System.out.println("NO");
        
        
        
        
    }
    
}
