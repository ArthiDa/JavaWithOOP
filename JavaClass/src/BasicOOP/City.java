/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOOP;

import java.util.Scanner;

/**
 *
 * @author ARTHI
 */
public class City {
    String name;
    int population,area;
    City(String n,int p,int a){ //Parametraized Constructor
        name=n;
        population=p;
        area=a;
    }
    City(){ //Default Constructor
        System.out.println("No Value");
    } 
//    void InputDetails(){
//        Scanner input = new Scanner(System.in);
//        name = input.nextLine();
//        population = input.nextInt();
//        area = input.nextInt();
//    }
//    void SetInformation(String n,int p,int a){
//        name=n;
//        population=p;
//        area=a;
//    }
    void OutDetails(){
        System.out.println("Name: "+name);
        System.out.println("Population: "+population);
        System.out.println("Area: "+area);
        System.out.println();
    }
    
}
