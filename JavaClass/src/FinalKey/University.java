
package FinalKey;

/**
 * usages of final variable
 * @author Hp
 */
public class University {
    final String NAME = "IIUC";//Can't change the value of the varible
    final int fees; // Blank final variable
    static final int students;//static blank final variable
    
    University(){
        fees = 60000;//Only intialize in constructor
    }
    static{
        students = 3000;
    }
    void show(){
        System.out.println("Name:"+NAME);
        System.out.println("Fees:"+fees);
        System.out.println("Students:"+students);
    }
    
    public static void main(String[] args) {
        University u1 = new University();
        u1.show();
    }
}

