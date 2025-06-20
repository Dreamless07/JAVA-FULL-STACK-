//                          with default keyword

interface newInter {//interface
    default void newMeth() {//method using default we can define it in interface itself
        System.out.println("We can use method body in Interface by using Default keyword in Java 8");
    }
}
class newClass implements newInter {//class
}

public class interfaceJ8 {
    public static void main(String[] args) {
        newInter newOb=new newClass();//object for that class
        newOb.newMeth();//call the method
    }
}

/*                           with static keyword

interface newInter {//interface
    static void newMeth() {//method using static we can define it in interface itself
        System.out.println("We can use method body in Interface by using Static keyword in Java 8");
    }
}
class newClass implements newInter {//class
}

public class interfaceJ8 {
    public static void main(String[] args) {
        newInter.newMeth();//call the method directly through Interface because no object needed
    }
}
 */