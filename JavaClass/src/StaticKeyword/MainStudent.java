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
public class MainStudent {
    public static void main(String[] args) {
        student s1 = new student("Arthi",201073);
        student s2 = new student("Sohel",193840);
        s1.show();
        s2.show();
        //we don't need to create object to access static varible
        //we just want to class name cz static varible related to its class not
        //object
        System.out.println("Country : "+student.country);
    }
    
}
