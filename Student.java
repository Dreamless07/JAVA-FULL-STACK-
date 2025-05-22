import java.util.Scanner;
class Student1{
    private int id;
    public String name;
    void displaydetails(int id, String name){
        System.out.println("The id is "+id+" and the name is "+name);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the id and name");
        int id=sc.nextInt();
        String name=sc.nextLine();
        Student1 obj=new Student1();
        obj.displaydetails(id,name);
    }
}
