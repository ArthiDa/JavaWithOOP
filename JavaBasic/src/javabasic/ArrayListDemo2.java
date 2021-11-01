/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>(5);
        ArrayList<Integer> n3 = new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(4,50);
        for (int i = 0; i < 5; i++) {
            int x=input.nextInt();
            n2.add(x);
        }
        System.out.println("ArrayList Contain: "+n);
        System.out.println("Size: "+n.size());
        //n.clear();
        boolean check = n.isEmpty();
        System.out.println(check);
        //boolean pos=n.contains(30);
        System.out.println(n.contains(30));
        System.out.println(n.indexOf(40));//get index of 40
        n.set(0,50);
        System.out.println(n);
        System.out.println(n.get(3));//get 3rd index value
        //System.out.println("Enter another array");
        n3.addAll(n2);//copy all value of n2 to n3
        if(n.equals(n2)==true)
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are not Equal");
        Collections.sort(n3);
        System.out.println(n3);
        Collections.sort(n2,Collections.reverseOrder());
        System.out.println(n2);

        
        
        
    }
    
}
