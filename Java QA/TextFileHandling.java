import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TextFileHandling {
    static File myFile = new File("Demo.txt"); //global declaration 
   
    static void create(String Demo){
    
        
        try {
           myFile.createNewFile(); 
        } catch (Exception e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

    }

    static void write(String FileName, String Data){

    
        try {
            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write(Data);
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void read(){
    
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

    static void append(String Demo){
    
        try(FileWriter fw = new FileWriter(Demo, true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw))
{
    out.println("the text");
    //more code
    out.println("more text");
    //more code
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}
    }

    // static void delete(){
    
    //     if(myFile.delete()){
    //         System.out.println("I have deleted:" + myFile.getName());
    //     }
    //     else{
    //         System.out.println("some problem occured while deleting a file");
    //     }
    // }

    
    public static void main(String[] args){
        String FileName = "Demo.txt";
        create(FileName);
        System.out.println("Test1 passed");

        String WritetoFile = "Keep coding ";
        write(FileName, WritetoFile);
        System.out.println("Test2 passed");

        read();
        System.out.println("Test3 passed");

        // delete();
        // System.out.println("File delted ");

        
}
}
