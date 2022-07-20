interface Bicycle{
    int a =  56;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying break");
    }

    public void speedUp(int increment){
        System.out.println("Applying Speed");
    }
}


public class Interface{
    public static void main(String[] args){
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        System.out.println(cycle.a);// you cannot modify the properties in interface as they are final 

    }
}
    