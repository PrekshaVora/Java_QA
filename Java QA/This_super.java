class One{
    int a;

    //getter of a 
    public int getA(){
        return a;
    }

    //constructor with parameter 
    One(int a){
        this.a= a; 
    }
    public int returnone(){
        return 1;
    }
}

class Two extends One{
    Two(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}


public class This_super{
    public static void main(String[] args){
        One o = new One(5);
        Two t = new Two(10);
        System.out.println(o.getA());
    }
}