//overridding example

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}


public class Bike extends Vehicle {

    void run(){ 
        //defining same method as parent class
        System.out.println("Bike is running");
    }
    public static void main(String[] args){
        Bike obj = new Bike(); //creating instance of class
        obj.run();//calling method with child class instance
    }
}
