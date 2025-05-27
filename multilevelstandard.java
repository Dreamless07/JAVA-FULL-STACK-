class Animal{//parent class
    String color;//2 features
    String type;
    Animal(String color, String type){
        this.color=color;//this keyword for local and instance var
        this.type=type;
    }
    void details(){//method
        System.out.println(color+" "+type);
    }
}

class Dog extends Animal {//child class
    String name;//extra feature
    Dog(String color, String type, String name){
        super(color, type);//super keyword for inheriting already present features
        this.name=name;
    }
    void details(){//method
        System.out.println(color+" "+type+" "+name);
    }
}

class Puppy extends Dog{//child class
    String gender;//extra feature
    Puppy(String color, String type, String name, String gender){
        super(color, type, name);
        this.gender=gender;
    }
    void details(){//method
        System.out.println("The dog is "+color+" and "+type+", its name is "+name+" and is a "+gender+".");
    }
}
public class multilevelstandard {
    public static void main(String[] args) {
        Puppy obj1=new Puppy("Brown","Omnivorous","Tom", "Male");//object
        obj1.details();//calling method
    }
}
