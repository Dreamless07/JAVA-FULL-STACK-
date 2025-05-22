class Parent{//parent class
    void A(){//method
        System.out.println("parent features");
    }
}
class Child extends Parent{//extends keyword for inheritance from parent to child class
    void A(){//function overriding(same name of method in both parent and child classes
        System.out.println("Parent features");
    }
    void B(){//another method for child class
        System.out.println("Own features");
    }
}
public class Singleinheritence {
    public static void main(String[] args) {
        Child ob=new Child();//object
        ob.A();
        ob.B();//access both classes
    }
}
