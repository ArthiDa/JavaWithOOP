/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyword;

/**
 *
 * @author ARTHI
 */
public class Counting {
    
    static int count = 0;
    //if we use non-static varible then count always initialize 0 for every objects
    //as a result output remain 1 for all object. 
    
    Counting(){
        count++;
    }
    void show(){
        System.out.println("Counting: "+count);
    }
    
}
