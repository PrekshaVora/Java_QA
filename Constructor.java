class MyEmployee{
    private int id;
    private String name;

    // public MyEmployee(){
    //     id = 45;
    //     name = "preksha";
    // }

    public MyEmployee(String myName){
        id = 45;
        name = myName;
    }

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

public class Constructor {
    public static void main(String[] args){
        MyEmployee preksha = new MyEmployee("preksha");
        
        
            //preksha.setName("Code");
            //preksha.setId(34);
            System.out.println(preksha.getId());
            System.out.println(preksha.getName());
    }
}
