import java.io.File;
import java.io.FileWriter;
public class Delete {
    public static void main(String[] args){

        
        File myFile = new File("Demo.txt");
        if(myFile.delete()){
            System.out.println("I have deleted:" + myFile.getName());
        }
        else{
            System.out.println("some problem occured while deleting a file");
        }
}
}
