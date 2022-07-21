import java.io.File;
import java.io.FileWriter;

public class Write {
    public static void main(String args[]){

    try {
            FileWriter fileWriter = new FileWriter("Demo.txt");
            fileWriter.write("This is a new file \n keep coding ");
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
