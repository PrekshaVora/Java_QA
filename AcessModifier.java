class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }


public void setName(String n){
    name = n;
}

public void setId(int i){
    id = i;
}

public int getId(){
    return id;
}
}

public class AcessModifier {
    public static void main(String[] args){
        MyEmployee preksha = new MyEmployee();
        //preksha.id = 10;
        //preksha.name = "work"; throws an error due to private access modifier 

        preksha.setName("Code");
        System.out.println(preksha.getName());
    }
}
