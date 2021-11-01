
package StaticMethod;

/**
 *
 * @author ARTHI
 */
public class MainExample {
    public static void main(String[] args) {
        Example ob = new Example();
        ob.show1();
        //to access static method we don't need to create object
        Example.show2();
        Example.show3();
    }
}
