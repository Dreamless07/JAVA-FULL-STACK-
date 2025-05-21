import java.util.Scanner;
class java{  // class declaration
    public void person(String name, int age )
    {//method declaration
        System.out.println(name+" "+age);
    }
    public void phone(String brand, String colour) {
        System.out.println(brand + " " + colour);
    }
}
public class methodsprog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and age");
        String name=sc.next();
        System.out.println("Enter phone brand and colour");
        String brand=sc.next();
        String colour=sc.next();
        java obj=new java();
        int age=sc.nextInt();
        obj.person(name, age);
        obj.phone(brand, colour);
    }
}
