
package Abstraction.Demo1;

/**
 *
 * @author Hp
 */
public abstract class MobileUser {
    
    //We can declare abstract or non abstract method in Abstract class
    
    abstract void sendMessage(); // no body
    
    void call(){
        System.out.println("Call Method"); 
    }
}
