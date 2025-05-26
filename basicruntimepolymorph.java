class Parentclass{// 2 classes = parent and child
    public void mobile(){// having same method name
        System.out.println("Parents phone usage");
    }
}
class Childclass extends Parentclass{
    public void mobile(){//same method name is overriding
        System.out.println("Now, own mobile phone usage");//if there was no body in this child class it would not override and only print the parent class content
    }
}

public class basicruntimepolymorph {
    public static void main(String[] args) {
        Childclass object= new Childclass();//single object
        object.mobile();//calls the overriding class if it contains body
    }
}
