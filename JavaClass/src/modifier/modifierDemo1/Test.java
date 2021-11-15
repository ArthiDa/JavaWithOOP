/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifier.modifierDemo1;

/**
 *
 * @author Hp
 */
public class Test {
    public static void main(String[] args) {
        A ob = new A();
      /*  ob.display();  */
        //we can't call private method
        ob.show();
        ob.showing();
    }
}
