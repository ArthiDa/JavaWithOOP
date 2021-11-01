
package Encapsulation;

/**
 *
 * @author ARTHI
 */
//We must be declare the varibles private
//To access we can use SetterGetter Method
public class SetterGetter {
    
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public static void main(String[] args) {
        SetterGetter ob1 = new SetterGetter();
        ob1.setAge(21);
        ob1.setName("Arthi");
        System.out.println("Name: "+ob1.getName());
        System.out.println("Age: "+ob1.getAge());
        
    }
    
}
