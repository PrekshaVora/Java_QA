public class Try {
    public static void main(String[] args){
        int a = 900;
        int b = 0; //arithmetic exception
        
        // //without try
        // int c = a/b;
        //     System.out.println("The result is:"+c);

       //with try
        try{
            int c = a/b;
            System.out.println("The result is:"+c);
        }
        catch(Exception e){
            System.out.println("Failed to Divide . Reason:");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
