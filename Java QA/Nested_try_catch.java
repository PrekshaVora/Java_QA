import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 6;
        marks[1] = 8;
        marks[2] = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();

        try{
            System.out.println("Welcome");
        

        try{
            System.out.println(marks[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("sorry this index does not exist");
            System.out.println("Exception in level 2");
        }
    }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
