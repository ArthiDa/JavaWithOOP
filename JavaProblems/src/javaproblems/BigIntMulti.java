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
public class BigIntMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            BigInteger x = input.nextBigInteger();
            BigInteger y = input.nextBigInteger();
            System.out.println(x.multiply(y));
        }
    }
    
}
