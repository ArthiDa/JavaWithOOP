/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproblems;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ARTHI
 */
public class ChooseElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
            
        }
        Arrays.sort(a);
        long sum=0;
        for (int i = n-1; i >= n-k; i--) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
    
}
