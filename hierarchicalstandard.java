class Fruit{//parent class
    String season;
    Fruit(String season){//constructor
        this.season=season;//for instance and local vars
    }
    void details(){//method
        System.out.println(season);
    }
}

class Banana extends Fruit{//child class
    String color;//extra feature
    Banana(String season, String color){//constructor
        super(season);//took season value from prev parent class
        this.color=color;
    }
    void details(){//method
        System.out.println("The Banana is "+color+" and is availabe in "+season+".");
    }
}

class Mango extends  Fruit{//child class
    int price;//extra feature
    Mango(String season, int price){
        super(season);
        this.price=price;
    }
    void details(){//method
        System.out.println("The Mango is "+price+"Rs/kg and is availabe during "+season+".");
    }
}

public class hierarchicalstandard {
    public static void main(String[] args) {
        Banana ob1=new Banana("All Seasons","Yellow");//objects
        Mango ob2=new Mango("Summer", 50);
        ob1.details();//calling the methods
        ob2.details();
    }
}
