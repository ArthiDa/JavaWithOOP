package StaticKeyword;

/**
 *
 * @author ARTHI
 */
public class student {
    String name;
    int id;
    //when there is a variable that its value is the same for all objects
    //then we can use static variable to reduce memory
    static String universityname = "IIUC"; // static not related to object
    //but related to its class
    
    static String country = "Bangladesh";
    
    student(String n,int i){
        name = n;
        id = i;
    }
    void show(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("University name: "+universityname);
    }
}
