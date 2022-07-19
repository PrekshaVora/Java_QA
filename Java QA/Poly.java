//polymorphism example

class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area is pie * r* r");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area of 0.5 * b *h ");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area of square of sides");
    }
}

public class Poly{
    public static void main(String[] args){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
    }
}