/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticMethod;

/**
 *
 * @author ARTHI
 */
public class StaticBlock {
    
    static int id;
    static String name;
    
    static{
        System.out.println("Static is the boss");
        id = 10;
        name = "Arthi";
    }
    static void show(){
        System.out.println("ID: "+id+" Name: "+name);
    }
    
    public static void main(String[] args) {
        StaticBlock.show();
    }
    
}
