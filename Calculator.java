import java.util.Scanner;
class calci{//one class with multiple methods
    public void addition (int a, int b){
        System.out.println((a+b));
    }
    public void subtraction (int a, int b){
        System.out.println((a-b));
    }
    public void multiplication (int a, int b){
        System.out.println((a*b));
    }
    public void division (int a, int b){
        if(b!=0){
            System.out.println(a/b);
        }
        else{
            System.out.println("Denominator cannot be zero");
        }
    }
    public void modulo (int a, int b){
        if (b != 0) {
            System.out.println((a%b));
        }
        else{
            System.out.println(("Undefined"));
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calci obj=new calci();
        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
        obj.modulo(a,b);
    }
}
