
package StaticMethod;

/**
 *
 * @author ARTHI
 */
public class Example {
    
    int x = 10;
    static int y = 10;
    
    void show1(){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("I am non-static method");
    }
    static void show2(){
        //we can't use non-static member in static method
        //System.out.println("X = "+x);
        System.out.println("I am static method");
    }
    static void show3(){
        System.out.println("Y = "+y);//We can use only staic member in static method
        System.out.println("I am also static method");
    }
    
}
