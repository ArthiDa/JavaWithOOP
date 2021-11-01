
package BasicOOP;

/**
 *
 * @author ARTHI
 */
public class Box {
    int height,width,depth;
    static int c = 0;
    Box(int h,int w,int d){
        height = h;
        width = w;
        depth = d;
    }
    void displayVol(){
        c++;
        System.out.println("The volume of "+c+" no box is "+(height*width*depth));
    }
    
    public static void main(String[] args) {
        Box A = new Box(10,10,10);
        Box B = new Box(20,30,10);
        A.displayVol();
        B.displayVol();
    }
}
