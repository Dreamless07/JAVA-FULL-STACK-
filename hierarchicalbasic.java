class King{//parent class
  void Demo(){//method
        System.out.println("Parent class");
    }
}

class Prince1 extends King{//child class
    void Demo(){//method from parent
        System.out.println("Parent features");
    }
    void Demo1(){//method1
        System.out.println("Extra features");
    }
}

class Prince2 extends King{
    void Demo(){//method from parent
        System.out.println("Parent features");
    }
    void Demo2(){//method2
        System.out.println("Extra features");
    }
}

public class hierarchicalbasic {
    public static void main(String[] args) {
        Prince1 obj1=new Prince1();//objects
        Prince2 obj2=new Prince2();
        King obj3=new King();
        obj1.Demo();//prince1 has demo from king and demo1 from itself and not demo2 from prince2
        obj1.Demo1();
        obj2.Demo2();//prince2 has demo from king and demo2 from itself and not demo1 from prince1
        obj2.Demo();
        obj3.Demo();//king only has demo from itself
    }
}
