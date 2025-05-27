interface newone{//new interface
    public void toprint();//contains all methods which will be abstract by default, also no need of keyword for that
}
class newtoo implements newone{//new class, usage of implements keyword for inheriting the interface
    public void toprint() {//same method with body for object creation
        System.out.println("The interface is created and object is accessed from new method");
    }
}
public class BasicInterface {
    public static void main(String[] args) {
        newtoo object=new newtoo();//object for new class
        object.toprint();//call the method
    }
}
