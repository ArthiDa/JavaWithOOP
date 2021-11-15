package File;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {
        File dir = new File("G:/Other computers/My Laptop (1)/Arthi/Java/For File/Arthi");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File newFile = new File(path + "/Student.txt");
        try {
            newFile.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }

        //want to use
        String id, name;

        try {
            Formatter formatter = new Formatter("G:/Other computers/My Laptop (1)/Arthi/Java/For File/Arthi/Student.txt");
            formatter.format("%s %s\r\n", "101", "Anisul");
            Scanner input = new Scanner(System.in);
            System.out.print("How many Students: ");
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter id and name: ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }
            formatter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
