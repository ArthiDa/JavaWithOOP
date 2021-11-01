/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Arrays;

/**
 *
 * @author ARTHI
 */
public class RangeBasedLoop {
    public static void main(String[] args) {
        String[] str={"Arthi","Arnob","Pritam","Sohel","Ilham"};
        Arrays.sort(str);
        //Collections.sort(str);
        for(String x: str){
            System.out.println(x);
            
        }
    }
    
}
