
package SuperKey.project;

/**
 *
 * @author ARTHI
 */
public class Person {
    String name;
    int age;
    
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
