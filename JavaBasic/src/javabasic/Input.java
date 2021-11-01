/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("Enter any number: ");
        N = input.nextInt();
        input.nextLine();
        String name;
        name = input.nextLine();
        System.out.println("Number = "+N);
        System.out.println("User name is "+name);
    }
}
