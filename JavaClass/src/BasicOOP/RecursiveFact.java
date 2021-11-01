/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOOP;

/**
 *
 * @author ARTHI
 */
public class RecursiveFact {
    
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        RecursiveFact ob1 = new RecursiveFact();
        System.out.println("Factorial of 5 is "+ob1.fact(5));
    }
    
}
