class Car{//parent class
    String color;
    String model;//2 attributes
    Car(String color, String model){//constructor
        this.color = color;
        this.model = model;//using this keyword for same instance and local var name
    }
    void print(){//method of h=the parent class
        System.out.println("The Car details are "+color+" "+model);
    }
}
class BMW extends Car{//child class extends the features of the parent class
    String fuel;//declare extra attribute
    BMW(String color,String model, String fuel){//constructor of the child class
        super(color,model);//added super keyword for accessing the attributes directly from parent class
        this.fuel=fuel;
    }
    void print(){//method for child class
            System.out.println("The BMW details are "+color+" "+model+" "+fuel);
        }
}

public class carinheritance {
    public static void main(String[] args) {
        Car obj1=new Car("Red", "2023");
        BMW obj2=new BMW("Green", "2023","Diesel");//objects with attributes in case of constructors
        obj1.print();
        obj2.print();//calling the methods

    }
}
