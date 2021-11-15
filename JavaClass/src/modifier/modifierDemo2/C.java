/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifier.modifierDemo2;
import modifier.modifierDemo1.A;

/**
 *
 * @author Hp
 */
public class C extends A{
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
        
        
    /*  ob.showing();  */
        //to access the protected method from another
        //package we have to inherit the class where 
        // the method belongs
        
        C ob2 = new C(); // as we inherits A, we have to create this class object
        ob2.showing();
    }
    
    
}