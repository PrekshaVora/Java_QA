interface A{  
    void a();//bydefault, public and abstract  
    void b();  
    void c();  
    void d();  
    }  

//create abstract class that provide implmentation 
abstract class B implements A{  
    public void c(){
        System.out.println("I am C");}  
    }  


//create subclass of abstract class 
class M extends B{  
    public void a(){System.out.println("I am a");}  
    public void b(){System.out.println("I am b");}  
    public void d(){System.out.println("I am d");}  
    }  

public class Interface_Abstract {
    public static void main(String args[]){
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
