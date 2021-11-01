/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ARTHI
 */
public class CurrentDate {
     public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat DF=new SimpleDateFormat("dd-MM-YYYY");
        String s = DF.format(date);
         System.out.println("After DateFormate : "+s);
        
    }
    
}
