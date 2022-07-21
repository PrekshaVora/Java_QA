import java.io.File;
import java.io.FileWriter;
public class FileHandling {
    public static void main(String[] args){

        File myFile = new File("Demo.txt"); //specify name of the file
        try {
           myFile.createNewFile(); 
        } catch (Exception e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        
}
}
