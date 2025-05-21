class car{//CLASS
    String name;
    String model;
    String color;
    int price;
    car(String cname, String cmodel, String ccolor, int cprice){//CONSTRUCTOR
        name=cname;
        model=cmodel;
        color=ccolor;
        price=cprice;
    }
    public void print(){//METHOD
        System.out.println(name+model+color+price );
    }
}

public class Vehicle {
    public static void main(String[] args) {
        car obj1=new car("Aston Martin ","DB12 ","Black ",4000000);
        car obj2=new car("Lamborghini ","Hurican ","Blue ",0);//METHOD IS CALLED TWO TIMES
        obj1.print();
        obj2.print();
    }
}
