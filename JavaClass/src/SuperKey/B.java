
package SuperKey;

/**
 *
 * @author ARTHI
 */
public class B extends A{
    int x=5;//use only instance varible
    B(){
        System.out.println("B's consturctor");
    }
    void show(){
        System.out.println("Value of x is "+x);
        System.out.println("Value of x is "+super.x);
    }
    @Override
    void display(){
        super.display();//without super keyword we cannot call display
        System.out.println("Inside B class");
    }
     public static void main(String[] args) {
        B ob = new B();
        ob.show();
        ob.display();
    }
}
