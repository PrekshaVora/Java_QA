public class Final {
    final int age = 18; //declare final variable
    void display(){
        age = 55; // reassigning value of age 
    }
    public static void main(String[] args){
        Final obj = new Final();
        obj.display();
    }
}
