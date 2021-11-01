/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Random;

/**
 *
 * @author ARTHI
 */
public class RandomNumberGen {
    public static void main(String[] args) {
        Random rand = new Random();
        int rn = rand.nextInt(100)+100;
        System.out.println(rn);
        int r = (int)(Math.random()*10);
        System.out.println(r);
    }
    
}
