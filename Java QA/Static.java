class Student{
    int rollno; //instance variable
    String name;
    static String college ="Somaiya"; //static variable

    //static method to change the value 
    static void change(){
        college = "A.p shah";
    }

    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+""+name+""+college); 
    }
}

public class Static {
    public static void main(String[] args){
        Student s1 = new Student(111,"Preksha");
        Student s2 = new Student(121,"Shreya");
    
        s1.display();
        s2.display();
    }
    
}
