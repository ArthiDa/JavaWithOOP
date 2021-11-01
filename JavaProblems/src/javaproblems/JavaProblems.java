package javaproblems;

import java.util.Scanner;

/*
 * @author ARTHI
 */
public class JavaProblems {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] a= new int[T];
        for (int i = 0; i < T; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i < T; i++) {
            if(a[i]==0){
                for (int j = 0; j < i/2; j++) {
                    int t=a[j];
                    a[j]=a[i-j-1];
                    a[i-j-1]=t; 
                }
            }
            
        }
        for (int i = 0; i < T; i++) {
            System.out.print(a[i]+" ");
            
        }

    }
}
