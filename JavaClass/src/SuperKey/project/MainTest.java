/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKey.project;

/**
 *
 * @author ARTHI
 */
public class MainTest {
    public static void main(String[] args) {
        Arthi p1 = new Arthi("Arthi",21,"CSE");
        System.out.println("Details of Arthi");
        p1.show();
        Pritam p2 = new Pritam("Pritam",21,"BME");
        System.out.println("\nDetails of Pritam");
        p2.show();
        Sohel p3 = new Sohel("Sohel",20,5.9);
        System.out.println("\nDetails of Sohel");
        p3.show();
        
    }
}
