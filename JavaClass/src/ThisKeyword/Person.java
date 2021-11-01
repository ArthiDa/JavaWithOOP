
package ThisKeyword;

/**
 *
 * @author Hp
 */
public class Person {
    String name;
    int age;
    String nation;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    Person(String name,int age,String nation){
        this(name,age);
        this.nation = nation;
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Nation: "+nation);

    }
    public static void main(String[] args) {
        Person p1 = new Person("Arthi",21);
        p1.display();
        Person p2 = new Person("Pranab",23,"Bangladesh");
        p2.display();
    }
}
