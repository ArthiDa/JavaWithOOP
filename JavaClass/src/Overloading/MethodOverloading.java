
package Overloading;

/**
 *
 * @author ARTHI
 */
public class MethodOverloading {
    
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(double a,double b, double c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("!!!");
    }
    
    public static void main(String[] args) {
        
        MethodOverloading ob1 = new MethodOverloading();
        
        ob1.add(5,6);
        ob1.add(5.6,6.5);
        ob1.add(5.6,2.3,5.7);
        ob1.add();
        System.out.println("Automatic type conversion");
        ob1.add(4.f,5,4);
        ob1.add('A','B');


        
    }
    
    
}
