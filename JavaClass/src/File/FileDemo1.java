
package File;

import java.io.File;


public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("G:/Other computers/My Laptop (1)/Arthi/Java/For File/Person");
        dir.mkdir();//Directory will be created
        
//        String dirLocation = dir.getAbsolutePath();
//        System.out.println(dirLocation);
//        System.out.println(dir.getName());
//        if(dir.delete()){
//            System.out.println("Folder has been deleted");
//        }
        String path = dir.getAbsolutePath();
        
        File file1 = new File(path+"/Student.txt");
        File file2 = new File("G:/Other computers/My Laptop (1)/Arthi/Java/For File/Person/Teacher.txt");        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File Created");
        } catch(Exception e){
            System.out.println(e);
        }
        
        if(file1.exists()){
            System.out.println("File exists");
        }
        
        
         
    }
}
