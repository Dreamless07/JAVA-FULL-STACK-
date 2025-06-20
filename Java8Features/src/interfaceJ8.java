interface newinter{//interface
    default void newMeth() {//method using default we can define it in interface itself
        System.out.println("We can use method body in Interface by using Default keyword in Java 8");
    }
}
class newClass implements newinter{//class
}

public class interfaceJ8 {
    public static void main(String[] args) {
        newinter newOb=new newClass();//object for that class
        newOb.newMeth();//call the method
    }
}
