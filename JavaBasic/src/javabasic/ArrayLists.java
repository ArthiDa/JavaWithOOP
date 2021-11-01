/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class ArrayLists {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>(4);
        ArrayList<Integer> n3 = new ArrayList<>(5);
        System.out.println("Size: " + n.size());
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
            n.add(a[i]);
        }
        Iterator itr = n.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        for (int i : n) {
            System.out.println(i);
        }
        n.remove(2);
        System.out.println(n);
        
        
        

    }

}
