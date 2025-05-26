abstract class hello{//abstract class
    abstract void greet();//method containing no body therefore abstract
}
class hi extends hello{//inherited class for accessing the abstract class
   void greet(){//same method is define with body and object can be created for this
        System.out.println("This is derived from ABSTRACT class");
    }
        }

public class BasicAbstraction {
    public static void main(String[] args) {
        hi ob=new hi();//object for the derived class
        ob.greet();//calling the method
    }
}
