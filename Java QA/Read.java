import java.io.File;
import java.util.Scanner;
public class Read {
    public static void main(String[] args){

        
        File myFile = new File("Demo.txt");

        try {
           Scanner sc = new Scanner(myFile); 
           while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
           }
           sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
}
}
