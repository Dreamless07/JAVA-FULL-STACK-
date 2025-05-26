import java.util.Scanner;

class Info{// same class
    void Student(String name,String branch){//same methods
        System.out.println("The name of the STUDENT is "+name+" and the BRANCH is "+branch);
    }
    void Student(String name,String branch,String address){
        System.out.println("The name of the STUDENT is "+name+", the BRANCH is "+branch+" and the address is "+address);
    }
}


public class CompileTime_polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info obnew=new Info();//single object
        System.out.println("Enter the Student name and mention address if availabe");
        String name=sc.nextLine();
        String branch=sc.nextLine();
        String address=sc.nextLine();
        obnew.Student(name, branch);//calls based on diff params
        obnew.Student(name, branch, address);
    }
}
