/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter array size");
        n = input.nextInt();
        int[] arr = new int[n];
        int l = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);

    }
}
