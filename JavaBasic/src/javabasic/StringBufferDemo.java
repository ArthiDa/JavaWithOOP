/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author ARTHI
 */
public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Arthi");
        System.out.println(sb);
        sb.append(" Barua");
        System.out.println(sb);
//        System.out.println(sb);
//        sb.delete(0, 6);
        sb.setLength(6);
        System.out.println(sb);
    }

}
