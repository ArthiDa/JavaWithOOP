
package Abstraction.Demo1;

/**
 *
 * @author Hp
 */
public class Rahim extends MobileUser {
    //We have to override otherwise its showing error
    //If we don't want to override than we have to declare the class as abstract
    @Override
    void sendMessage(){
        System.out.println("Hi, I am Rahim.");
    }
}
