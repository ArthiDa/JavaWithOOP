/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOOP;

/**
 *
 * @author ARTHI
 */
public class VariableLenArgu {
    
    void add(int ... num){ //work as array
        int sum = 0;
        for(int x:num){
            sum +=x;
        }
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        VariableLenArgu x = new VariableLenArgu();
        x.add(10,20,30);
        x.add(1,2,3,4,5,6,7);
        x.add(5);
        x.add(1,2,3,4,5,6,7,8,9,0);
    }
}
