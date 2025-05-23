class A{//Parent class
    void show(){//method of parent
        System.out.println("New feature");
    }
}
class B extends A{//derived child class from A
    void show(){//method
        System.out.println("Derived from A");
    }
    void display(){//new method
        System.out.println("New feature");
    }
}
class C extends B{//derived child class from B
    void show(){//method
        System.out.println("Derived from both A and B");
    }
    void display(){//method
        System.out.println("Derived from both A and B");
    }
    void print(){//new method
        System.out.println("New feature");
    }
}

public class multilevelbasic {
    public static void main(String[] args) {
        C obj1=new C();//objects
        B obj2=new B();
        A obj3=new A();
        obj1.show();//calling methods
        obj1.display();
        obj1.print();
        obj2.show();
        obj2.display();
        obj3.show();
    }
}
