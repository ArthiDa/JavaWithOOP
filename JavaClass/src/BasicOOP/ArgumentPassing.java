
package BasicOOP;

/**
 *
 * @author ARTHI
 */
public class ArgumentPassing {
    
    String name;
    //Paasing by Reference
    void change(ArgumentPassing a){ //a is also a object of class
        a.name = "Arthi";
    }
    //Passing by Value
    void change(int a){
        a = 20;
    }
    
    public static void main(String[] args) {
        System.out.println("Callby/Passby Value");
        ArgumentPassing ob1 = new ArgumentPassing();
        int x  = 10;
        System.out.println("Before call x: "+x);
        ob1.change(x);
        System.out.println("After call x: "+x);
        
        System.out.println("Callby/Passby Reference");
        ArgumentPassing ob2 = new ArgumentPassing();
        ob2.name = "Pranab";
        System.out.println("Before call ob2: "+ob2.name);
        ob2.change(ob2);//Pass object as reference
        System.out.println("After call ob2: "+ob2.name);


    }
}
