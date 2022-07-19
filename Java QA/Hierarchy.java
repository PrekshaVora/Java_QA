//multilevel

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking..");
    }
}

class Cat extends Animal{
    void weep(){
        System.out.println("weeping..");
    }
}

public class Hierarchy {
  public static void main(String[] args){
    Cat c = new Cat();
    //c.bark();
    c.eat();
    c.weep();

  } 
}
